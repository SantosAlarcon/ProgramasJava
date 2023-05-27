package ejemploset;

import java.util.HashSet;
import java.util.Iterator;
import usuarios.*;

public class Main {

    public static void main(String[] args) {
        HashSet<Persona> listaUsuarios = null;
        listaUsuarios = new HashSet<Persona>();

        // Metemos los datos
        listaUsuarios.add(new Persona("Juan Cimbrelo",1982,7,10));
        listaUsuarios.add(new Persona("Pepe Luis",1986,9,21));
        listaUsuarios.add(new Persona("Gator",1989,1,25));

        listaUsuarios.add(new Persona("Juan Cimbrelo",1982,7,10));
        listaUsuarios.add(new Persona("Pepe Luis",1986,9,21));
        listaUsuarios.add(new Persona("Gator",1989,1,25));

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