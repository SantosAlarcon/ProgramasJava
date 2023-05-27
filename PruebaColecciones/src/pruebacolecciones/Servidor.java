package pruebacolecciones;

import java.util.ArrayList;

public class Servidor {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private ArrayList<String> Usuarios = new ArrayList();

    @Override
    public String toString() {
        return "Usuarios = " + Usuarios;
    }

    Servidor(String ... usuarios) {

        for (String u : usuarios) {
            this.Usuarios.add(u);
        }
    }

}