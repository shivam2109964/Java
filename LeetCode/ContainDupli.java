package LeetCode;

public class ContainDupli {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        boolean result = containDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
