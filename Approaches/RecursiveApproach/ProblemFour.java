package Approaches.RecursiveApproach;

import java.util.Scanner;

// Factorial of a Number
public class ProblemFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = input.nextInt();
        int result = factorialFind(n);
        System.out.println(result);
        input.close();

    }

    public static int factorialFind(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorialFind(n - 1);
    }
}
