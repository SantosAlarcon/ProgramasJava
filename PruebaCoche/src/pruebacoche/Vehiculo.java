package pruebacoche;

public class Vehiculo {

    public String comprobarArrancado() {
        return "El motor está arrancado.\n";
    }

    public Vehiculo(double gasolina, TipoGasolina tipoGas, int velMax) {
        this.kmh = 0;
        this.gasolina = 0;
        this.arrancado = false;
        this.tipoGas = tipoGas;
        this.velMax = velMax;
    }

    public Vehiculo() {
        this.kmh = 0;
        this.gasolina = 0;
        this.arrancado = false;
        this.tipoGas = null;
        this.velMax = 0;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public int getKmh() {
        return kmh;
    }

    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

    public TipoGasolina getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(TipoGasolina tipoGas) {
        this.tipoGas = tipoGas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }
    private int kmh;
    private double gasolina;
    private boolean arrancado;
    private TipoGasolina tipoGas;
    private int velMax;

    public void arrancarMotor() {
        int progreso = 0;
        System.out.print("Arrancando motor: ");

        do {
            try {
                Thread.sleep(245);
                System.out.print(".");
                progreso += 2;
            } catch (Exception e) {
            }



        } while (progreso != 100);

        System.out.println("\nMotor arrancado.");

        this.arrancado = true;
    }

    public void pararMotor() {
        this.arrancado = true;
    }

    public void acelerar(int kmh) {
        this.kmh += kmh;
    }

    public void frenar(int kmh) {
        this.kmh -= kmh;
    }

    public void llenarDeposito(double gasolina) {
        this.gasolina += gasolina;
    }

    public void gastarDeposito(double gasolina) {
        this.gasolina -= gasolina;
    }

    public void aumentarMarcha() {

        if (this.kmh < this.velMax) {
            this.acelerar(2);
        }

    }
}
