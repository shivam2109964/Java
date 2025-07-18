package LeetCode;

import java.util.HashSet;

public class LargestPosInt {
    public static void main(String[] args) {
        int[] nums = { -1, 2, -3, 3 };
        int result = largestPoint(nums);
        if (result != -1) {
            System.out.println("We found it: " + result);
        } else {
            System.out.println("Not Existed");
        }
    }

    public static int largestPoint(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(max, Math.abs(num));
            }
            set.add(num);
        }
        return max;
    }
}
