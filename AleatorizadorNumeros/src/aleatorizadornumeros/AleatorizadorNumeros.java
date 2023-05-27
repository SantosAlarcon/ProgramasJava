package aleatorizadornumeros;

import java.util.Random;


public class AleatorizadorNumeros {
    private static int numero;

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        AleatorizadorNumeros.numero = numero;
    }

    public static int devolverNumero() {
        Random rnd = new Random();
        AleatorizadorNumeros.numero = rnd.nextInt(89999999)+10000000;
        return numero;
    }

}
