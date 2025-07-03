package Approaches.IterativeBased;
// Find the Maximum and Minimum Element in an Array

import java.util.Arrays;

// Input: {2, 4, 1, 7, 5}
// Output: Max: 7, Min: 1

import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }
        int max = findMaximum(array);
        int min = findMinimum(array);
        System.out.print(Arrays.toString(array));
        System.out.println("\nMAX: " + max + ", MIN: " + min);
        input.close();
    }

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
