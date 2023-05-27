package pruebaclasejugador;

public class Jugador {

    @Override
    public String toString() {
        return "Salud = " + salud;
    }
    
    private byte salud;
    private boolean vivo;

    public Jugador() {
        salud = 100;
        vivo = true;
    }

    public byte ObtSalud() {
        return (byte) salud;
    }

    public void Curar(int s) {
        this.salud += s;
    }

    public void Danyar(int s) {
        this.salud -= s;

        if (this.salud <= 0) {
            setVivo(false);
        }
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}