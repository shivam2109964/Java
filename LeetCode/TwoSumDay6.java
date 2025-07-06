package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumDay6 {
    public static void main(String[] args) {
        int[] array = { 2, 7, 19, 20 , 43, 12, 53, 64, 12};
        int target = 24;
        int[] result = twoSum(array, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] array, int target) {
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
