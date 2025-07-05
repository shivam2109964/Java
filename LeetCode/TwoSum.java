package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

public class TwoSum {
    public static void main(String[] args) {
    int [] nums = {2,7,11,15};
    int target = 26;
    int [] result = twoSum(nums, target);
    System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a Hash Map to store a number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            // If compliment is already in map, return its index and current index
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}