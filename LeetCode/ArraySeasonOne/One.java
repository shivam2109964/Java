package LeetCode.ArraySeasonOne;

public class One {
    public static void main(String[] args) {
        int[] nums = { 3, 2 };
        int k = 5;

        int result = minOperations(nums, k);
        System.out.println(result);
    }

    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        return sum % k;
    }
}
