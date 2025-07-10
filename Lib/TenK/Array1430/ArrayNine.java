package Lib.TenK.Array1430;

import java.util.Arrays;

public class ArrayNine {
    public static void main(String[] args) {
        int[] array = { 52, 47, 63, 95, 75, 94, 31, 45 };
        int length = array.length;
        int index = 2;
        int value = 2;
        insertArray(array, length, index, value);

    }

    public static void insertArray(int[] array, int length, int index, int value) {
        if (index < 0 || index > length) {
            System.out.println("Invalid");
            System.exit(1);
        }
        int[] newArray = new int[length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = value;

        for (int i = index; i < length; i++) {
            newArray[i + 1] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

}
