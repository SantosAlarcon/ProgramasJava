package pruebabatalla;

import java.util.Random;


public class Guerrero {
    Random rnd = new Random();

    @Override
    public String toString() {
        return "Salud de " + nombre + ": " + (int) getSalud();
    } 

    public Guerrero(String nombre) {
        this.nombre = nombre;
        this.salud = rnd.nextInt(101) + 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return (int) salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }
    
    private String nombre;
    private double salud;
    
}
