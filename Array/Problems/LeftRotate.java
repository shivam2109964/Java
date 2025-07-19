package Array.Problems;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        leftRotate(array);
        System.out.println(Arrays.toString(array));
    }

    public static void leftRotate(int[] array) {
        int len = array.length;
        int temp = array[0];

        for (int i = 1; i < len; i++) {
            array[i - 1] = array[i];
        }

        array[len - 1] = temp;
    }
}
