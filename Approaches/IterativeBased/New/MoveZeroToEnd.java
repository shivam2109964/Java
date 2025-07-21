package Approaches.IterativeBased.New;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 0, 1, 5, 0, 3, 2, 0, 4, 0, 2, 3, 0, 1, 0 };
        moveZeroToEnd(array);
    }

    public static void moveZeroToEnd(int[] array) {
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
