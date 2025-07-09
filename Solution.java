import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        List<String> result = summaryRanges(nums);
        System.out.println(result);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int start = i;

            // Keep going while the next number is exactly 1 more
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            // Now nums[start] to nums[i] is a full range
            if (start == i) {
                result.add(String.valueOf(nums[i])); // just one number
            } else {
                result.add(nums[start] + "->" + nums[i]); // a range
            }

            i++; // move to the next number
        }

        return result;
    }
}
