package pruebaconecta4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Conecta4 c4 = new Conecta4();
        Random rnd = new Random();

        for (int i = 0; i < 45; i++) {
            c4.añadirFicha(rnd.nextInt(9)+1, (rnd.nextInt(2) == 1) ? ColorFicha.AZUL : ColorFicha.ROJO);
        }

        System.out.println(c4.imprimirTablero());
    }

}