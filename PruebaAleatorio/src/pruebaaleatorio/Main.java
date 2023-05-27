package pruebaaleatorio;

import java.util.Random;


public class Main {


    public static void main(String[] args) {
        Random rnd = new Random();
        double n = 0;

        for (int i = 0; i < 50; i++) {

           n = (double) rnd.nextInt(100);

           System.out.println((n > 85) ? "¡¡Amos ahí!!" : "Joder");
        }

    }

}
