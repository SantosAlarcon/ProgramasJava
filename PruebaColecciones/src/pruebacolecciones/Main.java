/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebacolecciones;

/**
 *
 * @author asi204
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automoción garaje1 = new Automoción(1);
        Automoción garaje2 = new Automoción(2);
        garaje1.propietarios.add("Facundo");
        garaje1.propietarios.add("Capullo");
        garaje1.propietarios.add(0,"Tirolés");

        garaje1.propietarias.add(0,"Zorra");
        garaje1.propietarias.add(1,"Golfa");

        garaje2.propietarios.add("Alberto");
        garaje2.propietarios.add("Antonio");
        garaje2.propietarios.add(0,"Cimbrelo");

        garaje2.propietarias.add(0,"Melona");

        System.out.println(garaje1.toString());
        System.out.println(garaje2.toString());

        garaje2.propietarias.remove("Melona");

        System.out.println(garaje1.toString());
        System.out.println(garaje2.toString());
    }

}
