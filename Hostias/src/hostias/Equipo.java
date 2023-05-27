package hostias;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> miembros;

    public Equipo(String nombreEquipo) {
        nombreEquipo = nombreEquipo;
        miembros = new ArrayList<Jugador>();
    }

    public ArrayList<Jugador> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Jugador> miembros) {
        this.miembros = miembros;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void añadirMiembro(Jugador j) {
        miembros.add(j);
    }

    public Jugador obtenerMiembro(int indice) {
        return miembros.get(indice);
    }

    public Jugador obtenerMiembroVivo(int indice) {
        if (miembros.get(indice).getSalud() > 0) {
            return miembros.get(indice);
        }
        return null;
    }

    public int obtenerSaludTotal() {
        int saludTotal = 0;
        for (Jugador j : miembros) {
            saludTotal += j.getSalud();
        }
        return saludTotal;
    }


}