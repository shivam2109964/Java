package Array.Problems;

import java.util.Arrays;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        int[] array = { 7, 2, 9, 4, 6, 1, 3, 8, 5 };
        segregateEvenOdd(array);
        System.out.println(Arrays.toString(array));
    }

    static void segregateEvenOdd(int[] arr) {
        int i = -1; // Boundary for even number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
}
