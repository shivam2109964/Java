package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FreqCounter {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 2 };
        boolean result = freqCounter(nums);
        System.out.println(result);
        boolean moreOptResult = freqCounterOptimal(nums);
        System.out.println(moreOptResult);
    }

    public static boolean freqCounter(int[] nums) {
        if (nums.length < 1)
            return false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) > 1)
                return true;
        }
        return false;
    }

    // More Optimal Approach
    public static boolean freqCounterOptimal(int[] nums) {
        if (nums.length < 1)
            return false;

        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
