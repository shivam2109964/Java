package LeetCode;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result = removeDuplicates(array);
        System.out.println(result);

    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < array.length; j++) {
            System.out.println(Arrays.toString(array));
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
