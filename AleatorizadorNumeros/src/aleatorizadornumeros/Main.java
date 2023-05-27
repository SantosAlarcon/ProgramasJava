package aleatorizadornumeros;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("codigos.txt");
        FileWriter escritor = new FileWriter(f);

        for (int i = 0; i <= 100; i++) {
            escritor.write(Integer.toString(AleatorizadorNumeros.devolverNumero()));
            escritor.append('\n');
        }
        escritor.close();
    }
}
