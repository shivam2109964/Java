package Approaches.RecursiveApproach;

import java.util.Scanner;

// Check if a String is a Palindrome (Recursively)
public class ProblemSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String value: ");
        String value = input.nextLine();
        input.close();
        boolean result = isPalindrome(value, 0, value.length() - 1);
        if(result){
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

    public static boolean isPalindrome(String value, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (value.charAt(start) != value.charAt(end)) {
            return false;
        }
        return isPalindrome(value, start + 1, end - 1);
    }
}
