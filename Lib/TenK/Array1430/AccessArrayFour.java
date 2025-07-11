package Lib.TenK.Array1430;

import java.util.Scanner;

public class AccessArrayFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the index value: ");
        int index = input.nextInt();

        int result = accessArray(array, index);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }

        input.close();
    }

    public static int accessArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return -1;
        }

        return array[index];
    }
}
