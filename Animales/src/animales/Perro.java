package animales;


public class Perro extends Animal {

    @Override
    public String toString() {
        return "-- " + this.nombre + " --\nSexo = " + sexo +
        "\nEdad = " + this.obtenerEdad() + "\nColor = " + color + "\nNúm. patas = "
        + numPatas + "\nRaza = " + this.raza + "\n";
    }

    public Perro(int numPatas, String raza) {
        this.numPatas = numPatas;
        this.raza = raza;
    }

    public Perro(Sexo sexo, String nombre, Color color, String raza) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.color = color;
        this.numPatas = 4;
        this.raza = raza;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    private int numPatas;
    private String raza;
}
