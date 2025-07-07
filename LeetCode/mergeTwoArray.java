package LeetCode;

import java.util.Arrays;

public class mergeTwoArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int n = 3;
        int[] arrayOne = { 4, 5, 6 };
        mergeTwoArrays(array, arrayOne, m, n);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeTwoArrays(int[] array, int[] arrayOne, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(j >= 0){
            if(i >= 0 && array[i] > arrayOne[j]){
                array[k--] = array[i--];
            } else {
                array[k--] = arrayOne[j--]; 
            }
        }    
    }
}
