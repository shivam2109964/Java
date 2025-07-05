package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumAgain {
    public static void main(String[] args) {
        int[] array = { 2, 7, 11, 15 };
        int target = 26;
        int [] result = twoSumAgain(array, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSumAgain(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int compliment = target - array[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(array[i], i);
        }
        return new int[] {};
    }
}
