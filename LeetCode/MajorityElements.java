package LeetCode;

import java.util.Arrays;

public class MajorityElements {
    public static void main(String[] args) {
        int[] array = { 2, 2, 1, 3 };
        int result = majorityElement(array);
        System.out.println(result);

    }

    public static int majorityElement(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        System.out.println(n);
        return array[n / 2];
    }
}
