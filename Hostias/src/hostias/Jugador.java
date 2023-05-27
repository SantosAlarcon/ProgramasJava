package hostias;

public class Jugador {

    private String nombre;
    private int salud;
    private int saludBase;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.salud = 100;
        this.saludBase = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSaludBase() {
        return saludBase;
    }

    public void setSaludBase(int saludBase) {
        this.saludBase = saludBase;
    }
}
