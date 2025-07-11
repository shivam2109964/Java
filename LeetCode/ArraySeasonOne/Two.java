package LeetCode.ArraySeasonOne;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZero(arr);
        // System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZero(int[] arr) {
        int[] res = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length && index < arr.length; i++) {
            if (arr[i] == 0) {
                res[index++] = 0;
                if (index < arr.length) {
                    res[index++] = 0;
                }

            } else {
                res[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}
