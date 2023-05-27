package dejardecimales;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        double num = 43.045;

        JOptionPane.showMessageDialog(null, Math.IEEEremainder(num, (int) num));
    }

}
