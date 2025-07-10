package Lib.TenK.Array1430;

import java.util.Arrays;
import java.util.Scanner;

public class InsertStaticArrayA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the length of initial elements");
        int n = input.nextInt();

        checkLengthOfN(n, length);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the index at which you insert value: ");
        int index = input.nextInt();

        System.out.print("Enter the value: ");
        int value = input.nextInt();
        System.out.println(Arrays.toString(array));
        int result = insertStaticArrayA(array, n, index, value);

        if (result != -1) {
            System.out.println("Array after insertion");
            for (int i = 0; i <= n; i++) {
                System.out.print(array[i] + " ");
            }
        } else {

            System.out.println("Insertion failed: Invalid index or array full.");
        }
        input.close();
    }

    public static int insertStaticArrayA(int[] array, int n, int index, int value) {
        if (index < 0 || index > n || n == array.length) {
            return -1;
        }

        // Shift element
        for (int i = n - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        return 1;
    }

    public static void checkLengthOfN(int n, int length) {
        if (n > length) {
            System.out.println("Invalid initial length: exceeds array capacity.");
            System.exit(1);
            ;
        }
    }
}