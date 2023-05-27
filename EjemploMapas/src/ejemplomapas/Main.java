package ejemplomapas;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import usuarios.*;

public class Main {

    public static void main(String[] args) {
        HashMap<GregorianCalendar,Persona> mapa = null;
        mapa = new HashMap<GregorianCalendar,Persona>();

        // Metemos los datos
        Persona p1 = new Persona("Juan Cimbrelo",1982,7,10);
        Persona p2 = new Persona("Pepe Luis",1986,9,21);
        Persona p3 = new Persona("Gator",1989,1,25);

        mapa.put(p1.getFechaNac(), p1);
        mapa.put(p2.getFechaNac(), p2);
        mapa.put(p3.getFechaNac(), p3);

        // Recorremos las claves del mapa
        System.out.println("Impresión de las claves");
        Set<GregorianCalendar> claves = mapa.keySet();
        Iterator<GregorianCalendar> it = claves.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("\nImpresión de los valores");

        Collection<Persona> per = mapa.values();
        for (Persona p : per) {
            System.out.println(p);
        }

    }
}