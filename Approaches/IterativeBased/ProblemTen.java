package Approaches.IterativeBased;

import java.util.Scanner;

public class ProblemTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " elements: ");
            array[i] = input.nextInt();
        }
        boolean result = checkPalindrome(array, length);
        if (result != true) {
            System.out.println("Its not a palindrome");
        } else {
            System.out.println("Its a palindrome");
        }
        input.close();
    }

    public static boolean checkPalindrome(int[] array, int length) {
        boolean isPalindrome = true;
        for (int i = 0; i <= length / 2 && length != 1; i++) {
            if (array[i] != array[length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
