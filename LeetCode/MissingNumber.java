package LeetCode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 1 };
        int result = missingNumber(nums);
        System.out.println(result);
    }

    public static int missingNumber(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int i = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;

        while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
            i++;
        }
        return nums[i] + 1;

    }
}
