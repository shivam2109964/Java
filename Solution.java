import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = { 9 };
        int[] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}