package Java_Basics;

import java.util.Scanner;

// Write a Java program to print the sum of two numbers.

public class sum_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fist number:");
        int value = input.nextInt();
        System.out.println("Enter the second number:");
        int valueTwo = input.nextInt();

        int totalSum = value + valueTwo;

        System.out.println("Result is: " + totalSum);
        input.close();
    }
}
