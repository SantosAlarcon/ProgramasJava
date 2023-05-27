package pruebaclasejugador;

public class Main {

    public static void main(String[] args) {
        Jugador nerd = new Jugador();

        nerd.Danyar(20);

        System.out.println("El jugador nerd le queda " + nerd.ObtSalud()
                + " de salud.");

        nerd.Danyar(30);

        nerd.Curar(70);

        System.out.println("El jugador nerd le queda " + nerd.ObtSalud()
                + " de salud.");



        if (nerd.isVivo()) {
            System.out.println("El jugador está vivo.");
        } else {
            System.out.println("El jugador está muerto.");
        }
    }
}
