package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner entrada = new Scanner(System.in);
        int n_gen = rnd.nextInt(10) + 1;
        int n = 0;
        int veces = 0;
        int oportunidades = 5;
        boolean acertado = false;

        do {
            System.out.print("Introduce un número entre 1 y 10 > ");
            n = entrada.nextInt();

            if (n > n_gen) {
                veces++;
                oportunidades--;
                if (oportunidades > 0) {
                    System.out.println("El número es menor. Número de oportunidades: " + oportunidades + ".");
                }
            } else if (n < n_gen) {
                veces++;
                oportunidades--;
                if (oportunidades > 0) {
                    System.out.println("El número es mayor. Número de oportunidades: " + oportunidades + ".");
                }
            } else {
                acertado = true;
                System.out.println("¡¡Vamos ahí!! ¡Ese era el número!");

                if (veces == 1) {
                    System.out.println("Has intentado acertar el número " + veces + " vez.");
                } else if (veces > 1) {
                    System.out.println("Has intentado acertar el número " + veces + " veces.");
                } else {
                    System.out.println("¡¡La has acertado a la primera, macho!!");
                }

            }
        } while (oportunidades != 0 && !acertado);

        if (oportunidades == 0) {
            System.out.println("GAME OVER. El número era el " + n_gen + ".");
        }
    }
}
