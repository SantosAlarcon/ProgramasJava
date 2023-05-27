package animales;

import java.util.GregorianCalendar;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {
        HashSet<Animal> jauria = new HashSet<Animal>();

        Perro ani1 = new Perro(Sexo.MACHO,"Pelupi",Color.MARRON,"Carlino");
        ani1.fechaNac = new GregorianCalendar(2008,6,9);

        Periquito ani2 = new Periquito(Sexo.HEMBRA,"Sorra",Color.BLANCO,3.2d,2.2d);
        ani2.fechaNac = new GregorianCalendar(2007,3,1);

        Perro ani3 = new Perro(Sexo.MACHO,"Tani",Color.BLANQUINEGRO,"Husky Siberiano");
        ani3.fechaNac = new GregorianCalendar(2006,5,5);


        jauria.add(ani1);
        jauria.add(ani2);
        jauria.add(ani3);

        System.out.println(ani1);
        System.out.println(ani2);
        System.out.println(ani3);
    }



}
