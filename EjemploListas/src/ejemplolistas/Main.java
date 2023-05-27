package ejemplolistas;

import java.util.ArrayList;
import java.util.Iterator;
import usuarios.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> listaUsuarios = null;
        listaUsuarios = new ArrayList<Persona>();

        // Metemos los datos
        listaUsuarios.add(new Persona("Juan Cimbrelo",1982,7,10));
        listaUsuarios.add(new Persona("Pepe Luis",1986,9,21));
        listaUsuarios.add(new Persona("Gator",1989,1,25));

        // Recorremos los elementos de la lista

        // Recorrido con el for normal
        System.out.println("Recorrido normal");

        for (int i = 0; i < listaUsuarios.size();i++) {
            System.out.println(listaUsuarios.get(i));
        }

        // Recorrido con el iterator

        System.out.println("\nRecorrido con el iterator");
        Iterator<Persona> it = listaUsuarios.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());

        }

        // Recorrido con el for-each

        System.out.println("\nRecorrido con el for-each");
        for (Persona p : listaUsuarios) {
            System.out.println(p);
        }
    }
}