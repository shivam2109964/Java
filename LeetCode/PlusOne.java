package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = { 9 };
        int[] result = plusOne(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] array) {
        for (int i = array.length -1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            array[i] = 0;
        }
        array = new int[array.length + 1];
        array[0] = 1;
        return array;
    }

}
