package Approaches.TowPointer;

// Find Two Numbers that Sum to Target (Sorted Array)
// Input: {2, 7, 11, 15}, target = 9
// Output: 2 + 7 = 9 → true
public class ProblemThree {
    public static void main(String[] args) {
        int[] array = { 2, 7, 11, 15 };
        int target = 9;
        boolean result = sumToTarget(array, target);
        System.out.println(result + " -> " + target);
    }

    public static boolean sumToTarget(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
