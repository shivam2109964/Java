package Test.PhaseOne;

import java.util.Arrays;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        separateEvenAndOdd(array);
    }

    public static void separateEvenAndOdd(int[] array) {
        int i = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
