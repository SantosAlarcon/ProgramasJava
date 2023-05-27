package claseperro;

public class Main {

    public static void main(String[] args) {
        Perro p1 = new Perro("Txotxo",Raza.SHIBA_INU);

        System.out.println(p1);

        System.out.println(p1.obtenerVivo());

        System.out.println(p1.ladrar());

        System.out.println(p1.grunyir());

        p1.danyar(31);

        System.out.println(p1);

        Perro p2 = new Perro("Kazuki",Raza.CARLINO);

        System.out.println(p2);

    }

}