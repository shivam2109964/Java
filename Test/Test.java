package Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[6];
        int[] arrayTwo = { 12, 43, 64, 23, 75 };
        for (int i = 0; i < 4; i++) {
            array[arrayTwo[i]]++;
        }
        System.out.println(Arrays.toString(array));
    }
}
