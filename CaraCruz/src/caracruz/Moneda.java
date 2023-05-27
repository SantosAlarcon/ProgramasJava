/*
 * Simula un lanzamiento de moneda al aire, probando la instrucción Random.
 */
package caracruz;

import java.util.Random;

public class Moneda {

    public static final int MAX_LANZAMIENTOS = 20000;

    public static void main(String[] args) {
        Random moneda = new Random();
        int caras = 0;
        int cruces = 0;

        //i son los lanzamientos que va realizando
        for (int i = 0; i < Moneda.MAX_LANZAMIENTOS; i++) {
            if (moneda.nextInt(2) == 0) {
                caras++;
            } else {
                cruces++;
            }
        }

        System.out.println("Número de caras: " + caras + ". Porcentaje: "
                + (new Float(caras) / Moneda.MAX_LANZAMIENTOS * 100) + " %");
        System.out.println("Número de cruces: " + cruces + ". Porcentaje: "
                + (new Float(cruces) / Moneda.MAX_LANZAMIENTOS * 100) + " %");
    }
}
