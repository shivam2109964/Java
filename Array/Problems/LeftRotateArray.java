package Array.Problems;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        leftRotate(array, k);
        System.out.println(Arrays.toString(array));
    }

    public static void leftRotate(int[] array, int k) {
        int len = array.length;
        k = k % len; // Inc case k > n

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
