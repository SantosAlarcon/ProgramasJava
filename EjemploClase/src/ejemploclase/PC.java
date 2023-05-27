package ejemploclase;

public class PC {

    private String Proc;
    private int Mem;
    private String Graf;
    private int DD;
    private Lector Lct;

    public PC(String Proc, int Mem, String Graf, int DD, Lector Lct) {
        this.Proc = Proc;
        this.Mem = Mem;
        this.Graf = Graf;
        this.DD = DD / 1024;
        this.Lct = Lct;
    }

    public int getDD() {
        return DD;
    }

    public String getGraf() {
        return Graf;
    }

    public void setGraf(String Graf) {
        this.Graf = Graf;
    }

    public Lector getLct() {
        return Lct;
    }

    public void setLct(Lector Lct) {
        this.Lct = Lct;
    }

    public int getMem() {
        return Mem;
    }

    public void setMem(int Mem) {
        this.Mem = Mem;
    }

    public String getProc() {
        return Proc;
    }

    public void setProc(String Proc) {
        this.Proc = Proc;
    }

    @Override
    public String toString() {
        return "PC\n" + "Procesador = " + Proc + "\nMemoria = " + Mem +
        "\nTarjeta Gráfica = " + Graf + "\nDisco Duro = " + DD +
        "\nLector Óptico = "   + Lct;
    }
}
