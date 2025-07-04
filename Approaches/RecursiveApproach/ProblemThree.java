package Approaches.RecursiveApproach;

import java.util.Scanner;

// Sum of First N Natural Numbers
public class ProblemThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = input.nextInt();
        int result = sumByRec(n);
        input.close();
        System.out.println(result);
    }

    public static int sumByRec(int n) {
        if (n == 0) {
            return n;
        }
        return n + sumByRec(n - 1);
        
    }
}
