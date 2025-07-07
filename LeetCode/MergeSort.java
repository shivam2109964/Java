package LeetCode;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 12, 8, 9, 3, 11, 5, 4 };
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Recursive function to divide the array
    public static void mergeSort(int[] array) {
        if (array.length < 2)
            return;
        int mid = array.length / 2;

        // Divide array into two halves
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursive sort
        mergeSort(left);
        mergeSort(right);
        // Merge sorted halves
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
       
        // Merge until one array is exhausted
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining element from left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining element from right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
