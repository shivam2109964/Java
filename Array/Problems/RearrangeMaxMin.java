package Array.Problems;

import java.util.Arrays;

public class RearrangeMaxMin {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        rearrangeMaxMin(array);
        System.out.println(Arrays.toString(array));
    }

    public static void rearrangeMaxMin(int[] array) {
        int len = array.length;
        int[] result = new int[len];
        int left = 0;
        int right = len - 1;
        
        for(int i = 0; i < len; i++){
            if(i % 2 == 0){
                result[i] = array[right--];
            } else {
                result[i] = array[left++];
            }
        }
        // Copy result back to original array
        for(int i = 0; i < len; i++){
            array[i] = result[i];
        }
    }
}
