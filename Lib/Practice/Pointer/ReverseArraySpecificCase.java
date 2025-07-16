package Lib.Practice.Pointer;

import java.util.Arrays;

public class ReverseArraySpecificCase {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverseArraySpecificCase(arr, 2, 6);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArraySpecificCase(int[] arr, int from, int to) {
        int left = from ;
        int right = to;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
