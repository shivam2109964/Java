package Test.PhaseOneArray;

import java.util.Arrays;

public class RotateArrayByKStep {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArrayKStep(array, k);
        System.out.println(Arrays.toString(array));
    }

    public static void rotateArrayKStep(int[] array, int k) {
        if (array == null || array.length <= 1 || k == 0) {
            return;
        }

        int len = array.length;
        k = k % len;

        // Step 1: Reverse first k elements
        reverse(array, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(array, k, len - 1);

        // Step 3: Reverse the entire array
        reverse(array, 0, len - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
