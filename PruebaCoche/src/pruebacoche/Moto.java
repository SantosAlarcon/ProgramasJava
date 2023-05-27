package pruebacoche;


public class Moto extends Vehiculo {
    public Moto(TipoGasolina tipo, int velMax) {
        this.setKmh(0);
        this.setGasolina(0);
        this.setArrancado(false);
        this.setTipoGas(tipo);
        this.setVelMax(velMax);
    }
}
