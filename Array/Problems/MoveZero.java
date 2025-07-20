package Array.Problems;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] array = { 1, 2, 0, 4, 3, 0, 5, 0 };
        moveZero(array);
    }

    public static void moveZero(int[] array) {
        int len = array.length;
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (array[j] != 0) {
                array[i] = array[j];
                i++;
            }
        }

        while(i < len){
            array[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
