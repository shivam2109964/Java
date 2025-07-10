package Lib.TenK.Array1430;

import java.util.Scanner;

public class ArrayAccessSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " value: ");
            array[i] = input.nextInt();
        }

        System.out.println("Enter the index value ");
        int index = input.nextInt();

        int result = accessElement(array, index);
        if (result != -1) {
            System.out.println("At index " + index + " the value is " + result);
        } else {
            System.out.println("Invalid Index");
        }
        input.close();
    }

    public static int accessElement(int[] array, int index) {
        if (index > 0 && index < array.length) {
            return array[index];
        }
        return -1;
    }

}
