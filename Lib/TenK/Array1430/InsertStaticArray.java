package Lib.TenK.Array1430;

import java.util.Arrays;
import java.util.Scanner;

public class InsertStaticArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array capacity (max size): ");
        int capacity = input.nextInt();
        int[] array = new int[capacity];

        System.out.print("Enter numbers of elements to insert initially: ");
        int n = input.nextInt();

        if (n > capacity) {
            System.out.println("Error: Initial elements exceed capacity");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.println("Enter index to insert at: ");
        int index = input.nextInt();

        System.out.println("Enter value to insert: ");
        int value = input.nextInt();

        int result = insertAtIndex(array, n, capacity, index, value);
        if (result == -1) {
            System.out.println("Insertion failed: Invalid index or array full.");
        } else {
            System.out.println("Array after insertion");
            for (int i = 0; i <= n; i++) {
                System.out.println(array[i] + " ");
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static int insertAtIndex(int[] array, int n, int capacity, int index, int value) {
        if (index >= 0 && index < array.length) {

            if (index < 0 && index > n || n == capacity) {
                return -1;
            }
            // shift element
            for (int i = n - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
        } else {
            return -1;
        }

        // insert value
        array[index] = value;
        return 1;
    }
}
