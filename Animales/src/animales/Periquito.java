package animales;

public class Periquito extends Animal {

    @Override
    public String toString() {
        return "-- " + this.nombre + " --\nSexo = " + sexo +
        "\nEdad = " + obtenerEdad() + "\nColor = " + color + "\nTamanyo = " + tamanyo +
        "\nTamanyo del pico = " + tamanyoPico + "\n";
    }

    public Periquito(Sexo sexo, String nombre, Color color, double tamanyo, double tamanyoPico) {
        this.tamanyo = tamanyo;
        this.tamanyoPico = tamanyoPico;
        this.sexo = sexo;
        this.nombre = nombre;
        this.color = color;
    }

    public double getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(double tamanyo) {
        this.tamanyo = tamanyo;
    }

    public double getTamanyoPico() {
        return tamanyoPico;
    }

    public void setTamanyoPico(double tamanyoPico) {
        this.tamanyoPico = tamanyoPico;
    }

    private double tamanyo;
    private double tamanyoPico;
}
