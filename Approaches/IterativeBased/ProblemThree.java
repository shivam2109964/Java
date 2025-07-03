package Approaches.IterativeBased;

import java.util.Scanner;

// Calculate Factorial of a Number
// Input: n = 5
// Output: 120

public class ProblemThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n to calc factorial: ");
        int value = input.nextInt();
        int result = findFactorial(value);
        System.out.println("Factorial value is " + result);
        input.close();
    }
    public static int findFactorial(int value){
        int fact = 1;
        for(int i = 1; i <= value; i++){
            fact *= i;
        }
        return fact;
    }
}
