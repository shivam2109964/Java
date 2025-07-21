package Approaches.IterativeBased.New;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        rotateArray(array, k);
        System.out.println(Arrays.toString(array));
    }

    static void rotateArray(int[] array, int k) {
        int len = array.length;
        k = k % len;

        reverse(array, 0, k - 1);
        reverse(array, k, len - 1);
        reverse(array, 0, len - 1);
    }

    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
