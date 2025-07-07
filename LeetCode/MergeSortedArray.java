package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arrayOne = { 1, 2, 3, 0, 0, 0 };
        int[] arrayTwo = {4, 5, 6};
        int m = 3; 
        int n = 3;
        mergeSort(arrayOne, arrayTwo, m, n);
        System.out.println(Arrays.toString(arrayOne));
    }

    public static void mergeSort(int[] arrayOne, int[] arrayTwo, int m, int n) {
        int i = m;
        for (int j = 0; j < n; j++) {
            arrayOne[i] = arrayTwo[j];
            i++;
        }
    }
}
