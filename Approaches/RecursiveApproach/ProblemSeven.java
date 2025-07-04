package Approaches.RecursiveApproach;

import java.util.Scanner;

// Print Sum of Digits of a Number
public class ProblemSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int result = sumOfDigit(number);
        input.close();
        System.out.println(result);;
    }
    public static int sumOfDigit(int number){
        if(number == 0){
            return 0;
        }
        return number % 10 + sumOfDigit(number / 10);
    }
}
