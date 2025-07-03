package Approaches.IterativeBased;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " value: ");
            array[i] = input.nextInt();
        }
        int result = secondLargestValue(array);
        System.out.print(Arrays.toString(array));
        System.out.println("\nThe Second Largest element is " + result);
        input.close();
    }

    public static int secondLargestValue(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }
}
