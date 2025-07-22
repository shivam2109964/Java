package Test.PhaseOneArray;

import java.util.Arrays;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4 };
        separateEvenAndOdd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void separateEvenAndOdd(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            // Move left pointer forward if it's even
            while (left < right && array[left] % 2 == 0) {
                left++;
            }

            // Move right pointer backward if it's odd
            while (left < right && array[right] % 2 != 0) {
                right--;
            }

            // Now left is at odd, right is at even -> swap them
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
