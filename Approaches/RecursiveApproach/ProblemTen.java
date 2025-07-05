package Approaches.RecursiveApproach;

import java.util.Scanner;

// Count Number of Zeros in a Number
// Input: 1020304
// Output: 3

public class ProblemTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int result = zerosFreq(number);
        System.out.println(result);
        input.close();
    }

    public static int zerosFreq(int number) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        if (lastDigit == 0) {
            return 1 + zerosFreq(number / 10);
        } else {
            return zerosFreq(number / 10);
        }
    }
}
