package prueba;

import futuzor.LectorTeclado;
import java.io.IOException;

public class Prueba {

    public static void main(String[] args) throws IOException {
        double doble = LectorTeclado.leerDouble();
        System.out.println("Has introducido: " + doble + ".");
    }
}
