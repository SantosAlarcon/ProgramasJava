package pruebaarray;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
    }

}
