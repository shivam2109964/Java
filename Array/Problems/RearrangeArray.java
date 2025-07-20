package Array.Problems;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 1 };
        rearrange(array);
        System.out.println(Arrays.toString(array));
    }

    public static void rearrange(int[] array) {
        int n = array.length;

        // 1- Based even position: i + 1 is even => i is odd
        for (int i = 1; i < n; i++) {
            // 1-based even position: i + 1 is even => i is odd (0-based)
            if ((i + 1) % 2 == 0) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                }
            } else {
                if (array[i] > array[i - 1]) {
                    swap(array, i, i - 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
