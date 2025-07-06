package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class pracOne {
    public static void main(String[] args) {
        int[] array = { 2, 7, 11, 15 };
        int target = 9;
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
