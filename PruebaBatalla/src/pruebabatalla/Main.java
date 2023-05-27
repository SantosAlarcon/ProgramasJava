package pruebabatalla;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        Guerrero g1 = new Guerrero("Farlopo");
        Guerrero g2 = new Guerrero("Xoxo");

        do {

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            g1.setSalud(g1.getSalud() - (g1.getSalud() * rnd.nextInt(21) + 30D) / 100D);
            g2.setSalud(g2.getSalud() - (g2.getSalud() * rnd.nextInt(21) + 30D) / 100D);
            System.out.println(g1 + "\n" + g2 + "\n");


        } while (g1.getSalud() != 0 && g2.getSalud() != 0);

        if (g1.getSalud() != 0) {
            System.out.println("¡¡" + g1.getNombre() + " ha ganado la batalla!!");
        } else {
            System.out.println("¡¡" + g2.getNombre() + " ha ganado la batalla!!");
        }
    }
}
