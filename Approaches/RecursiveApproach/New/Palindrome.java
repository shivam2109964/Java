package Approaches.RecursiveApproach.New;

public class Palindrome {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 1 };
        boolean isTrue = isPalindrome(array, 0, array.length - 1);
        System.out.println(isTrue);
    }

    public static boolean isPalindrome(int[] array, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // If mismatch found
        if (array[left] != array[right]) {
            return false;
        }
        return isPalindrome(array, left + 1, right - 1);
    }
}
