package enraya;

/**
 * Clase con las propiedades del <b>3 en raya</b>.
 * @author FutuzorMekkla
 */

public class TresEnRaya {

    private static final int ALTO = 3;
    private static final int ANCHO = 3;
    private TipoFicha[][] tablero;

    /**
     * Crea un nuevo <B>Tres en Raya</b> rellenando todos los huecos vacíos.
     */
    public TresEnRaya() {
        this.tablero = new TipoFicha[ALTO][ANCHO];

        // Rellenamos los huecos con fichas vacías.
        for (int i = 0; i < ALTO; i++) {
            for (int j = 0; j < ANCHO; j++) {
                tablero[i][j] = TipoFicha.VAC;
            }
        }
    }

    /**
     * Comprueba si hay un hueco disponible en la fila y columna introducidas
     * por el usuario.
     * @param fila Fila del tablero.
     * @param columna Columna del tablero.
     * @return true Si el hueco está vacío. Si está ocupado por una ficha devuelve
     * <code>false</code>.
     */
    public boolean huecoDisponible(int fila, int columna) {
        if (this.tablero[fila][columna] == TipoFicha.VAC) {
            return true;
        }
        return false;
    }

    /**
     * Añade una ficha en la fila y columna especificada.
     * @param fila Fila del tablero.
     * @param columna Columna del tablero.
     * @param ficha Ficha que se desea colocar en el hueco.
     */
    public boolean añadirFicha(int fila, int columna, TipoFicha ficha) {

        if (fila >= 0 || fila < ALTO || columna >= 0 || columna <= ANCHO) {
            if (this.huecoDisponible(fila, columna)) {
                this.tablero[fila][columna] = ficha;
                return true;
            }
        }

        return false;
    }

    /**
     * Devuelve una representación gráfica del tablero en forma.
     * @return Devuelve una cadena que es una representación gráfica del tablero, así:<br>
     * <code>[ ][ ][ ]</code><br>
     * <code>[ ][ ][ ]</code><br>
     * <code>[ ][ ][ ]</code><br>
     */
    public String imprimirTablero() {
        StringBuilder tabl = new StringBuilder();

        for (int i = 0; i < ALTO; i++) {
            for (int j = 0; j < ANCHO; j++) {
                switch (tablero[i][j]) {
                    case O:
                        tabl.append("[O]");
                        break;
                    case X:
                        tabl.append("[X]");
                        break;
                    case VAC:
                        tabl.append("[ ]");
                        break;
                }
            }
            tabl.append("\n");
        }
        return tabl.toString();
    }

    /**
     * Comprueba si hay 3 fichas del mismo tipo en vertical, horizontal,diagonal, o
     * que estén todas las casillas ocupadas.
     * @return true Si coinciden 3 fichas del mismo tipo en vertical, horizontal, 
     * diagonal, o que todas las casillas estén ocupadas.
     * Devuelve <code>false</code> si no ocurre nada.
     */
    public boolean comprobarGanador() {
        // Comprobación horizontal
        for (int i = 0; i < ALTO; i++) {
            if (tablero[i][0] == TipoFicha.O && tablero[i][1] == TipoFicha.O
                    && tablero[i][2] == TipoFicha.O) {
                return true;
            }
            if (tablero[i][0] == TipoFicha.X && tablero[i][1] == TipoFicha.X
                    && tablero[i][2] == TipoFicha.X) {
                return true;
            }
        }
        
        // Comprobación vertical
        for (int i = 0; i < ANCHO; i++) {
            if (tablero[0][i] == TipoFicha.O && tablero[1][0] == TipoFicha.O
                    && tablero[2][i] == TipoFicha.O) {
                return true;
            }
            if (tablero[0][i] == TipoFicha.X && tablero[1][0] == TipoFicha.X
                    && tablero[2][i] == TipoFicha.X) {
                return true;
            }
        }

        // Comprobación diagonal
        if (tablero[0][2] == TipoFicha.O && tablero[1][1] == TipoFicha.O
                && tablero[2][0] == TipoFicha.O) {
            return true;
        }

        if (tablero[0][2] == TipoFicha.X && tablero[1][1] == TipoFicha.X
                && tablero[2][0] == TipoFicha.X) {
            return true;
        }
        
        // Comprobación diagonal invertida
        if (tablero[0][0] == TipoFicha.O && tablero[1][1] == TipoFicha.O
                && tablero[2][2] == TipoFicha.O) {
            return true;
        }

        if (tablero[0][0] == TipoFicha.X && tablero[1][1] == TipoFicha.X
                && tablero[2][2] == TipoFicha.X) {
            return true;
        }

        // Comprobación de que todas las casillas estén llenas
        int cas_ocu = 0;
        for (int i = 0; i < ALTO; i++) {
            for (int j = 0; j < ANCHO; j++) {
                if (tablero[i][j] != TipoFicha.VAC) {
                    cas_ocu++;
                }
            }
        }

        if (cas_ocu == 9) {
            return true;
        }

        return false;
    }

    /**
     * Devuelve el tipo de ficha que hay en la posición del tablero.
     * @param fila Fila del tablero.
     * @param columna Columna del tablero.
     * @return FIcha ocupada en esa posición.
     */
    public TipoFicha comprobarPos(int fila, int columna) {
        return this.tablero[fila][columna];
    }

}
