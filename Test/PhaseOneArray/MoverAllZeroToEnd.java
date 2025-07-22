package Test.PhaseOneArray;

import java.util.Arrays;

public class MoverAllZeroToEnd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 1, 0, 2, 0, 3, 2, 0, 1, 0, 2, 0, 6, 0, 3, 0, 1 };
        moveAllZero(array);
        System.out.println(Arrays.toString(array));
    }

    public static void moveAllZero(int[] array) {
        int len = array.length;

        int i = 0;
        for (int j = 0; j < len; j++) {
            if (array[j] != 0) {
                array[i] = array[j];
                i++;
            }
        }
        while (i < len) {
            array[i] = 0;
            i++;
        }
    }
}
