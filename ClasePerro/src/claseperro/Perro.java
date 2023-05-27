package claseperro;

public class Perro {

    @Override
    public String toString() {
        return "-- " + nombre + " --\nRaza = " + obtenerRaza()
                + "\nSalud = " + salud +"\n";
    }

    public boolean isVivo() {
        return vivo;
    }

    public String ladrar() {
        return this.nombre + ": ¡¡Guau!!";
    }

    public String grunyir() {
        return this.nombre + ": ¡¡Grrrrrrrrrrrrrrr!!\n";
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Perro(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.salud = 100;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerRaza() {
        return raza.name().replace('_', ' ');
    }

    public void cambiarRaza(Raza raza) {
        this.raza = raza;
    }

    public int getSalud() {
        return salud;
    }

    public void matarPerro() {
        this.salud = 0;
        this.vivo = false;
    }

    public String obtenerVivo() {
        String mensaje;

        if (this.isVivo()) {
            mensaje = this.getNombre() + " está vivo.";
        } else {
            mensaje = this.getNombre() + " está muerto.";
        }

        return mensaje + "\n";

    }

    public int danyar(int cnt) {
        return this.salud -= cnt;
    }
    
    private String nombre;
    private Raza raza;
    private int salud;
    private boolean vivo;
}
