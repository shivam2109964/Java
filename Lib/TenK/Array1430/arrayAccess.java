package Lib.TenK.Array1430;

import java.util.Scanner;

public class arrayAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " value: ");
            array[i] = input.nextInt();
        }
        System.out.print("Enter the k index to return the value: ");
        int k = input.nextInt();
        input.close();

        int result = accessArray(array, k);
        if (result != -1) {
            System.out.println("Element at index " + k + " is: " + array[k]);
        } else{
            System.out.println("Invalid Index.");
        }
    }

    public static int accessArray(int[] array, int k) {
        if (k >= 0 && k < array.length) {
            return array[k];
        } else {
            return -1;
        }
    }
}
