package Test.PhaseOneArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        if (array == null || array.length <= 1)
            return; // Edge Case

        // Two Pointer
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
