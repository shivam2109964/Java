package Approaches.RecursiveApproach;

import java.util.Scanner;

// Print Numbers from 1 to N
// Input: N = 5
// Output: 1 2 3 4 5

public class ProblemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n number: ");
        int n = input.nextInt();
        printRec(n);
        input.close();
    }

    public static void printRec(int n) {
        if (n == 0) {
            return;
        }
        printRec(n - 1);
        System.out.println(n);
    }
}
