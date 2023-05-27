package cuentabancaria;


public class Main {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Gilipollas Caraculo");
        c1.setNCC("55343-436645-W5534-43-33");
        c1.setSaldo(557.7f);

        System.out.println(c1);
    }

}
