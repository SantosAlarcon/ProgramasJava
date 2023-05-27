package metepalabrasgui;

import javax.swing.JOptionPane;

public class Main {

    public static String metePalabras(String ... palabras) {
        String listaPal = "";

        if (palabras.length == 0) {

            listaPal += "No has puesto ná de ná.";

        } else {

            for (String p : palabras) {
                listaPal += "+ " + p + "\n";
            }

            listaPal += "\nHas metido " + palabras.length
            + " palabras en la lista.";

        }

        return listaPal;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, metePalabras("bragas", "tetas",
                "chocho", "vagina", "tanga", "bullate", "liguero", "medias",
                "sujetador","delantal","bikini","minifalda","corset","albornoz"));
    }
}
