package Approaches.IterativeBased.New;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] array = { 1, 6, 9, 8, 3, 5, 4, 9, 7 };
        separateEvenOdd(array);
    }

    public static void separateEvenOdd(int[] array) {
        int len = array.length;
        int left = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                int temp = array[left];
                array[left] = array[i];
                array[i] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void separateEvenOddPreserveOrder(int[] array) {
        int[] result = new int[array.length];
        int index = 0;

        // First collect even number
        for (int value : array) {
            if (value % 2 == 0) {
                result[index++] = value;
            }
        }
        // Then collect odd numbers
        for (int value : array) {
            if (value % 2 != 0) {
                result[index++] = value;
            }
        }
        // copy result back to original array
        System.arraycopy(result, 0, array, 0, array.length);
    }
}
