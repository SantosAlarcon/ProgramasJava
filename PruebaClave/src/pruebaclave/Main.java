package pruebaclave;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        char[] codigo = new char[3];
        String clave = "";
        int veces = 0;

        do {

            for (int i = 0; i < codigo.length; i++) {
                codigo[i] = (char) (rnd.nextInt(26) + 65);
            }

            clave = String.valueOf(codigo);

            System.out.println(clave);

            veces += 1;

        } while (!clave.equals("MIO"));

        System.out.println("\nCantidad de veces que ha tardado: " + veces+ ".");
    }

}
