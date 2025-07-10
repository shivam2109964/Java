package Lib.TenK.Array1430;

import java.util.Arrays;
import java.util.Scanner;

public class updateElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }
        System.out.print("On which index you want to update the value");
        System.out.println("Index: ");
        int i = input.nextInt();
        System.out.println("Value: ");
        int value = input.nextInt();
        int[] result = updateArray(array, length, i, value);
        if (result.length == 0) {
            System.out.println("Invalid index. No update performed.");
        } else {
            System.out.println("After updated array: ");
            System.out.println(Arrays.toString(result));
        }
        input.close();
    }

    public static int[] updateArray(int[] array, int length, int i, int value) {
        if (i >= 0 && i < array.length) {
            array[i] = value;
            return array;
        } else {
            return new int[0];
        }
    }
}
