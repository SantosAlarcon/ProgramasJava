package hostias;

public class Partida {
    private static Equipo eq1;
    private static Equipo eq2;

    public static Equipo getEq1() {
        return eq1;
    }

    public static void setEq1(Equipo eq1) {
        Partida.eq1 = eq1;
    }

    public static Equipo getEq2() {
        return eq2;
    }

    public static void setEq2(Equipo eq2) {
        Partida.eq2 = eq2;
    }
}
