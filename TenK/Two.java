package TenK;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int[] array = { 10, 5, 10 };
        int result = getSecondLargest(array);
        System.out.println(result);
    }

    public static int getSecondLargest(int[] array) {
        int n = array.length;
        Arrays.sort(array);
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] != array[n - 1]) {
                return array[i];
            }
        }
        return -1;
    }
}
