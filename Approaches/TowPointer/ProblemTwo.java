package Approaches.TowPointer;
// Check if a String is a Palindrome

// Input: "madam"
// Output: true

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String value: ");
        String value = input.nextLine();
        boolean isPalindrome = checkPalindrome(value);
        System.out.println(isPalindrome);
        input.close(); 
    }

    public static boolean checkPalindrome(String value) {
        int left = 0;
        int right = value.length() - 1;
        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
