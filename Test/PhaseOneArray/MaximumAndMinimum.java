package Test.PhaseOneArray;

import java.util.Arrays;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] array = { 3, -7, 0, 12, 5, 99, -1 };
        int[] result = findMinMax(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty. No min or max");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[] { min, max };
    }
}
