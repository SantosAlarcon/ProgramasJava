/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;

import java.util.Arrays;

/**
 *
 * @author asi204
 */
public class Main {

    public static final int tamanyo = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[Main.tamanyo];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            System.out.println(array[i]);
        }

        Arrays.fill(args, array);
        for(Integer i : array) {

        }
        // TODO code application logic here
    }
}
