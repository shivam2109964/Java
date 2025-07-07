package LeetCode;

import java.util.Arrays;

public class MergeSortTwo {
    public static void main(String[] args) {
        int[] array = { 52, 45, 8, 46, 52, 14, 69, 87, 35, 46, 91, 24, 62, 49 };
        mergeSortTwo(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSortTwo(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSortTwo(left);
        mergeSortTwo(right);

        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        // copy remaining elements from left array
        while (i < left.length) {
            array[k++] = left[i++];
        }
        // copy remaining elements from right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
