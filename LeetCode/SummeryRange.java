package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummeryRange {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        List<String> result = summaryRange(nums);
        System.out.println(result);
    }

    public static List<String> summaryRange(int[] nums) {
        List<String> newArray = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int start = i;
            System.out.println(start);
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
                System.out.println(i + "---");
            }

            if (start == i) {
                newArray.add(String.valueOf(nums[i]));
            } else {
                newArray.add(nums[start] + "->" + nums[i]);
            }
            i++;
        }
        return newArray;
    }
}
