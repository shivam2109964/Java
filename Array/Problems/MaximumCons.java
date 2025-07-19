package Array.Problems;

public class MaximumCons {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int result = maximumCons(array);
        System.out.println(result);
    }

    public static int maximumCons(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return count;
    }
}
