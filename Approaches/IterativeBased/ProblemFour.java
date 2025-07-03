package Approaches.IterativeBased;

import java.util.Scanner;

// Sum of All Elements in an Array
// Input: {3, 1, 4, 1, 5}
// Output: 14

public class ProblemFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of list: ");
        int length = input.nextInt();
        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.println("Total Sum is: " + sum);
        input.close();
    }
}
