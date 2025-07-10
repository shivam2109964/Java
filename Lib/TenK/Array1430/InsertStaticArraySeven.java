package Lib.TenK.Array1430;

import java.util.Scanner;

public class InsertStaticArraySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the size of elements ");
        int n = input.nextInt();
        checkNSize(length, n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }

        System.out.println("Enter the index value");
        int index = input.nextInt();

        System.out.println("Entre the value of index");
        int value = input.nextInt();

        int result = inserStaticArraySeven(array, n, index, value);
        if (result != -1) {
            System.out.println("Successful Insertion");
            for (int i = 0; i <= n; i++) {
                System.out.print(array[i] + " ");
            }
        } else{
            System.out.println("Invalid");
        }

        input.close();

    }

    public static int inserStaticArraySeven(int[] array, int n, int index, int value) {
        if (index < 0 || index > n || n == array.length) {
            return -1;
        }

        // shift the element
        for (int i = n - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        return 1;
    }

    public static void checkNSize(int length, int n) {
        if (n > length) {
            System.out.print("Invalid Size of n");
            System.exit(1);
        }
    }
}
