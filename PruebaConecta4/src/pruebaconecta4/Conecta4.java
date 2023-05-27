package pruebaconecta4;

/**
 * Clase que contiene métodos y propiedades del <b>Conecta 4</b>.
 * @author FutuzorMekkla
 */
public class Conecta4 {

    private static final int ANCHO = 11;
    private static final int ALTO = 7;
    private ColorFicha[][] tablero;

    /**
     * Genera un nuevo tablero de <b>Conecta 4</b>.
     */
    public Conecta4() {
        this.tablero = new ColorFicha[ALTO][ANCHO];

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                this.tablero[i][j] = ColorFicha.VACIO;
            }
        }
    }

    /**
     * Comprueba si en la columna hay algún hueco libre.
     * @param columna Número de columna que se le pasa por parámetro.
     * @return true Si la columna tiene un hueco libre. Devuelve <code>false</code>
     * si no la hay.
     */
    public boolean huecoDisponible(int columna) {
        for (int i = 0; i < this.tablero.length; i++) {
            if (this.tablero[i][columna] == ColorFicha.VACIO) {
                return true;
            }
        }
        return false;
    }

    /**
     * Inserta una ficha en la columna escogida por el usuario.
     * @param columna Número de columna
     * @param ficha Color de la ficha.
     */
    public void añadirFicha(int columna, ColorFicha ficha) {
        if (huecoDisponible(columna - 1)) {
            for (int i = 0; i < tablero.length; i++) {
                if (tablero[i][columna - 1] == ColorFicha.VACIO) {
                    tablero[i][columna - 1] = ficha;
                    break;
                }
            }
        }
    }

    /**
     * Devuelve una representación gráfica del tablero de <b>Conecta 4</b>.
     * @return Una representación del tablero en formato cadena.
     */
    public String imprimirTablero() {
        StringBuilder tabl = new StringBuilder();

        for (int i = ALTO - 1; i >= 0; i--) {
            for (int j = 0; j < ANCHO - 1; j++) {
                switch (tablero[i][j]) {
                    case ROJO:
                        tabl.append("[R]");
                        break;
                    case AZUL:
                        tabl.append("[A]");
                        break;
                    case VACIO:
                        tabl.append("[ ]");
                        break;
                }
            }
            tabl.append("\n");
        }
        return tabl.toString();
    }

    /**
     * Comprueba si hay fichas del mismo color en sentido horizontal, vertical o
     * diagonal (normal e invertida).
     * @return true Si hay fichas del mismo color en sentido horizontal, vertical o
     * diagonal.
     */
    public boolean comprobarGanador() {

        for (int i = 0; i < ALTO; i++) {
            for (int j = 0; j < ANCHO; j++) {
                // Comprobación horizontal
                if (j == ANCHO - 3) {
                    if (tablero[i][j] == ColorFicha.ROJO
                            && tablero[i][j + 1] == ColorFicha.ROJO
                            && tablero[i][j + 2] == ColorFicha.ROJO
                            && tablero[i][j + 3] == ColorFicha.ROJO) {
                        return true;
                    }
                }

                if (j == ANCHO - 3) {
                    if (tablero[i][j] == ColorFicha.AZUL
                            && tablero[i][j + 1] == ColorFicha.AZUL
                            && tablero[i][j + 2] == ColorFicha.AZUL
                            && tablero[i][j + 3] == ColorFicha.AZUL) {
                        return true;
                    }
                }

                // Comprobación horizontal
                if (j == ALTO - 3) {
                    if (tablero[i][j] == ColorFicha.ROJO
                            && tablero[i + 1][j] == ColorFicha.ROJO
                            && tablero[i + 2][j] == ColorFicha.ROJO
                            && tablero[i + 3][j] == ColorFicha.ROJO) {
                        return true;
                    }
                }

                if (j == ALTO - 3) {
                    if (tablero[i][j] == ColorFicha.AZUL
                            && tablero[i + 1][j] == ColorFicha.AZUL
                            && tablero[i + 2][j] == ColorFicha.AZUL
                            && tablero[i + 3][j] == ColorFicha.AZUL) {
                        return true;
                    }
                }

                // Comprobación diagonal
                if (j == ALTO - 3 && i == ANCHO - 3) {
                    if (tablero[i][j] == ColorFicha.ROJO
                            && tablero[i + 1][j - 1] == ColorFicha.ROJO
                            && tablero[i + 2][j - 2] == ColorFicha.ROJO
                            && tablero[i + 3][j - 3] == ColorFicha.ROJO) {
                        return true;
                    }
                }

                if (j == ALTO - 3 && i == ANCHO - 3) {
                    if (tablero[i][j] == ColorFicha.AZUL
                            && tablero[i + 1][j - 1] == ColorFicha.AZUL
                            && tablero[i + 2][j - 2] == ColorFicha.AZUL
                            && tablero[i + 3][j - 3] == ColorFicha.AZUL) {
                        return true;
                    }
                }

                // Comprobación diagonal invertido
                if (j == ALTO - 3 && i == ANCHO - 3) {
                    if (tablero[i][j] == ColorFicha.ROJO
                            && tablero[i - 1][j + 1] == ColorFicha.ROJO
                            && tablero[i - 2][j + 2] == ColorFicha.ROJO
                            && tablero[i - 3][j + 3] == ColorFicha.ROJO) {
                        return true;
                    }
                }

                if (j == ALTO - 3 && i == ANCHO - 3) {
                    if (tablero[i][j] == ColorFicha.AZUL
                            && tablero[i - 1][j + 1] == ColorFicha.AZUL
                            && tablero[i - 2][j + 2] == ColorFicha.AZUL
                            && tablero[i - 3][j + 3] == ColorFicha.AZUL) {
                        return true;
                    }
                }


            }
        }
        return false;
    }

    /**
     * Devuvelve el color de la ficha que hay en la posición del tablero.
     * @param fila Fila del tablero
     * @param columna Columna del tablero
     * @return Color de la ficha que se encuentra en la posición.
     */
    public ColorFicha devolverFicha(int fila, int columna) {
        return tablero[fila][columna];
    }

}
