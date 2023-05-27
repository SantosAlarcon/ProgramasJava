package pruebacoche;


public class Main {

    public static void main(String[] args) {
        Moto vespa = new Moto(TipoGasolina.DIESEL, 295);
        vespa.llenarDeposito(90D);

        vespa.arrancarMotor();

        do {
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
            }

            vespa.aumentarMarcha();
            System.out.println(vespa.getKmh());

        } while (vespa.getGasolina() != 0);
    }

}
