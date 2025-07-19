package Array.Problems;

import java.util.Arrays;

public class MovesZeroToEnd {
    public static void main(String[] args) {
        int[] array = { 1, 0, 2, 3, 0, 4, 0, 1 };
        movesZeroToEnd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void movesZeroToEnd(int[] array) {
        int len = array.length;
        int j = 0;

        for (int i = 0; i < len; i++) {
            if (array[i] != 0) {
                array[j] = array[i];
                j++;
            }
        }
        while (j < len) {
            array[j] = 0;
            j++;
        }
    }
}
