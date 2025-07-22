package Approaches.RecursiveApproach.New;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5 };
        int[] arrayOne = { 2, 4, 6, 8 };
        int[] merged = merge(array, arrayOne, 0, 0);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] merge(int[] array, int[] arrayOne, int i, int j) {
        // Base case
        if (i == array.length) {
            return Arrays.copyOfRange(arrayOne, j, arrayOne.length);
        }
        if (j == arrayOne.length) {
            return Arrays.copyOfRange(array, i, array.length);
        }
        // Recursive Case
        if (array[i] < arrayOne[j]) {
            int[] rest = merge(array, arrayOne, i + 1, j);
            int[] result = new int[rest.length + 1];
            result[0] = array[i];
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        } else {
            int[] rest = merge(array, arrayOne, i, j + 1);
            int[] result = new int[rest.length + 1];
            result[0] = arrayOne[j];
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        }
    }
}
