package futuzor;

import java.io.IOException;
import java.util.Scanner;

public class LectorTeclado {
    private static Scanner escaner = new Scanner(System.in);

    /**
     * Lee un número entero a través del teclado.
     * @return Número entero introducido por teclado.
     */
    public static int leerEntero() {
        return escaner.nextInt();
    }

    /**
     * Lee un número corto a través del teclado.
     * @return Número corto introducido por teclado.
     */
    public static short leerShort() {
        return escaner.nextShort();
    }

    /**
     * Lee un número largo a través del teclado.
     * @return Número largo introducido por teclado.
     */
    public static long leerLong() {
        return escaner.nextLong();
    }

    /**
     * Lee un número doble a través del teclado.
     * @return Número doble introducido por teclado.
     * @throws InputMismatchException si el usuario introduce una letra.
     */
    public static double leerDouble() {
        return escaner.nextDouble();
    }

    /**
     * Lee un carácter a través del teclado.
     * @return Carácter introducido por teclado.
     */
    public static char leerCaracter() throws IOException {
        return (char) System.in.read();
    }

    /**
     * Lee una cadena de texto a través del teclado.
     * @return Cadena de texto introducida por teclado.
     */
    public static String leerCadena() {
        return escaner.nextLine();
    }

    /**
     * Lee un carácter que representa un Sí o un No.
     * Si el usuario pulsa la tecla 'S' devuelve <b>true</b>, y <b>false</b>
     * si el usuario pulsa otra tecla distinta de 'S'.
     * @return <b>true</b> si el usuario ha pulsado la 'S'.<br>
     * <b>false</b> si el usuario ha pulsado otra tecla distinta.
     */

    public static boolean leerSiNo() throws IOException {
        char letra = (char) System.in.read();

        if (letra == 's' || letra == 'S')
            return true;

        return false;
    }
}