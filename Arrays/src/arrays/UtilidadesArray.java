package arrays;

import java.util.Arrays;

public class UtilidadesArray {

    public static int[] arrayNum;

    public UtilidadesArray(int longitud) throws Exception {
        if (longitud == 0) {
            throw new Exception("No se permite crear con longitud 0");
        } else {
            arrayNum = new int[longitud];
        }
    }

    public void añadirNumeroArray(int num) throws Exception {
        if (num < 0) {
            throw new Exception("No se permite introducir números negativos");
        }

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == 0) {
                arrayNum[i] = num;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayNum);
    }

}
