package animales;

import java.util.GregorianCalendar;

public class Animal {

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(GregorianCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Animal(Sexo sexo, String nombre, Color color) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.color = color;
    }

    public Animal() {
        
    }

    @Override
    public String toString() {
        return "-- " + this.nombre + " --\nSexo = " + sexo +
        "\nEdad = " + edad + "\nColor=" + color + "\n";
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int obtenerEdad() {
        GregorianCalendar fecha_hoy = new GregorianCalendar();
        return fecha_hoy.get(GregorianCalendar.YEAR) -
        fechaNac.get(GregorianCalendar.YEAR);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    protected Sexo sexo;
    protected String nombre;
    protected int edad;
    protected Color color;
    protected GregorianCalendar fechaNac;
}
