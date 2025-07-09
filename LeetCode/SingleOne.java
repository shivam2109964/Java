package LeetCode;

public class SingleOne {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        int result = singleNumber(nums);
        System.out.println(result);
        System.out.println(4 ^ 1);
    }

    public static int singleNumber(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = index ^ nums[i];
        }
        return index;
    }
}
