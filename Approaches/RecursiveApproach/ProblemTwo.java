package Approaches.RecursiveApproach;

import java.util.Scanner;

// Print Numbers from N to 1
public class ProblemTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = input.nextInt();
        printRec(n);
        input.close();
    }

    public static void printRec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printRec(n - 1);
    }
}
