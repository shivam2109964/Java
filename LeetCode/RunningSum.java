package LeetCode;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int[] result = runningSum(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] runningSum(int[] array) {
        int[] runningArray = new int[array.length];
        int i = 0;
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[i];
            runningArray[j] = sum;
            i++;
        }
        return runningArray;
    }
}
