package enraya;

import UtilidadesBase.Teclado;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int fila = 0, columna = 0;
        TipoFicha jug = TipoFicha.O;
        TipoFicha cpu = TipoFicha.X;
        TresEnRaya mi3enR = new TresEnRaya();
        Random rnd = new Random();

        do {
            do {
                do {
                    System.out.print("Introduce la fila (0-2)> ");
                    fila = Teclado.leerEntero();
                } while (fila < 0 || fila > 2);

                do {
                    System.out.print("Introduce la columna (0-2)> ");
                    columna = Teclado.leerEntero();
                } while (columna < 0 || columna > 2);
            } while (mi3enR.comprobarPos(fila, columna) != TipoFicha.VAC);

            mi3enR.añadirFicha(fila, columna, jug);
            System.out.println(mi3enR.imprimirTablero());

            do {
                fila = rnd.nextInt(3);
                columna = rnd.nextInt(3);
            } while (mi3enR.comprobarPos(fila, columna) != TipoFicha.VAC);

            mi3enR.añadirFicha(fila, columna, cpu);
            System.out.println(mi3enR.imprimirTablero());

        } while (!mi3enR.comprobarGanador());
    }
}
