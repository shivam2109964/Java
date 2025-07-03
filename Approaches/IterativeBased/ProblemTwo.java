package Approaches.IterativeBased;

import java.util.Scanner;

// Count Digits of a Number
// Input: num = 12345
// Output: 5

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value = input.nextInt();
        input.close();
        int result = digitsCount(value);
        System.out.println("Total Digits is: " + result);
    }

    public static int digitsCount(int value) {
        int count = 0;
        while (value != 0) {
            value = value / 10;
            count++;
        }
        return count;
    }

}
