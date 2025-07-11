package Lib.TenK.Array1430;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the index to delete");
        int index = input.nextInt();

        int indexCheck = checkIndex(index, length);
        if (indexCheck != -1) {
            for (int i = index; i < length - 1; i++) {
                array[i] = array[i + 1];
            }
            length--;
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Invalid");
        }
        input.close();
    }

    public static int checkIndex(int index, int length) {
        if (index < 0 || index >= length) {
            return -1;
        }
        return 1;
    }
}