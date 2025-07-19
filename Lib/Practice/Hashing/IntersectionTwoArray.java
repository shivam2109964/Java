package Lib.Practice.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> intersectArray = new ArrayList<>();

        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersectArray.add(num);
                freqMap.put(num, freqMap.getOrDefault(num, 0) - 1);
            }
        }
        int[] result = new int[intersectArray.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersectArray.get(i);
        }
        return result;
    }
}
