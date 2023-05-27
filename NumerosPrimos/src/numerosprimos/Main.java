package numerosprimos;

public class Main {

    public static void main(String[] args) {
        boolean es_primo;
        int cont = 1;

        for (int i = 1; i <= 1000; i++) {

            es_primo = true;

            while (es_primo && cont <= i) {
                if (i % cont == 0 && i != cont) {
                    es_primo = false;
                    cont = 2;
                } else {
                    cont++;
                }
            }

            if (es_primo) {
                cont = 2;
                System.out.println(i);
            }
        }
    }
}