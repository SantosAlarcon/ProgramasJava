package adivinaelnumerogui;

public class Partida {

    private int numDificultad = 0;
    private int numGen = 0;
    private int numMax = 0;
    private int numOpor = 5;
    private boolean partidaCreada = false;

    public boolean isPartidaCreada() {
        return partidaCreada;
    }

    public void setPartidaCreada(boolean partidaCreada) {
        this.partidaCreada = partidaCreada;
    }

    public int getNumDificultad() {
        return numDificultad;
    }

    public void setNumDificultad(int numDificultad) {
        numDificultad = numDificultad;
    }

    public int getNumGen() {
        return numGen;
    }

    public void setNumGen(int numGen) {
        numGen = numGen;
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        numMax = numMax;
    }

    public int getNumOpor() {
        return numOpor;
    }

    public void setNumOpor(int numOpor) {
        numOpor = numOpor;
    }

    public Partida() {
        numDificultad = 0;
        numGen = 0;
        numMax = 0;
        numOpor = 5;
    }
}
