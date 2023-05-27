package pruebacolecciones;

import java.util.ArrayList;
import java.util.Vector;


public class Automoción {

    @Override
    public String toString() {
        return "Garaje " +this.numGaraje + "\n" +
        "Propietarios = " + propietarios + "\nPropietarias = " + propietarias + "\n";
    }
    public Vector<String> propietarios;
    public ArrayList<String> propietarias;
    public int numGaraje;

    public Automoción(int garaje) {
        this.numGaraje = garaje;
        this.propietarios = new Vector<String>();
        this.propietarias = new ArrayList<String>();
    }
}
