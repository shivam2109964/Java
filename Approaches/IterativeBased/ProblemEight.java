package Approaches.IterativeBased;

import java.util.Scanner;

// Count Frequency of a Character in a String 
// Input: "banana", char = 'a'
// Output: 3

public class ProblemEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String value: ");
        String value = input.nextLine();
        System.out.print("Enter the char: ");
        char ch = input.nextLine().charAt(0);
        int result = countFreq(value, ch);
        System.out.println("From the String: " + value + " frequency of " + ch + ": is " + result);
        input.close();
    }

    public static int countFreq(String value, char ch) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
