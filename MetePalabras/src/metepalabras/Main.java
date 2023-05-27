package metepalabras;

public class Main {

    /*
     * Este es un ejemplo conjunto del número invariable de parámetros y el
     * recorrido del número de elementos mediante el for-each. A su vez,
     * se muestra en pantalla toda la lista de palabras que hemos introducido
     * y cuántas hay en total.
     */

     public static String MetePalabras(String ... palabras) {
       String lista = "";

        for (String p : palabras) {
            lista += "+ " + p + "\n";
        }

        lista += "\n-- Hay " + palabras.length + " palabras en la lista. --";

        return lista;
    }

    public static void main(String[] args) {
        System.out.println(MetePalabras("culo", "tetas", "chocho", "bragas",
        "sujetador","coño","bullate", "tanga", "bikini","medias","liguero"));
    }
}
