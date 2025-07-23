package Test.PhaseOneArray;

import java.util.Arrays;

public class RecSubArr {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        recSubArray(array, 0, 0);
    }

    public static void recSubArray(int[] array, int start, int end) {
        if (start == array.length) {
            return;
        }

        if (end < array.length) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, start, end + 1)));
            recSubArray(array, start, end + 1);
        } else {
            recSubArray(array, start + 1, start + 1);
        }
    }
}
