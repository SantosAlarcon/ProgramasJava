package pruebaarchivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter escritor = new FileWriter("eee.txt");
        FileReader lector = new FileReader("eee.txt");

        escritor.write("Lala me chupa la polla por la noche la muy 'rata'.");

        escritor.close();
    }

}
