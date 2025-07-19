package Array.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProb {
    public static void main(String[] args) {
        int[] array = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] result = twoSumProb(array, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSumProb(int[] array, int target) {
        int len = array.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            int compliment = target - array[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(array[i], i);
        }
        return new int[] { -1, -1 };
    }
}
