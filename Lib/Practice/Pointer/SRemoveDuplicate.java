package Lib.Practice.Pointer;

import java.util.Arrays;

public class SRemoveDuplicate {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 3, 4, 4 };
        int length = removeDuplicate(array);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicate(int[] array) {
        if (array.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
                System.out.println(Arrays.toString(array));
            }
        }
        return i + 1;
    }
}
