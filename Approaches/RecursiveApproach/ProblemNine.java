package Approaches.RecursiveApproach;

import java.util.Scanner;

public class ProblemNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = input.nextInt();
        int result = fibonacciNumber(n);
        System.out.println("Fibonacci number at position: " + n + " is: " + result);
        input.close();
    }

    public static int fibonacciNumber(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
