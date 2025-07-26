package Test.PhaseOne;

import java.util.Arrays;

public class MoveAllZeroAtTheEnd {
    public static void main(String[] args) {
        int[] array = { 1, 0, 1, 0, 2, 0, 1, 3, 0, 2, 1, 0, 2, 1 };
        moveAllZeroAtEnd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void moveAllZeroAtEnd(int[] array) {
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
