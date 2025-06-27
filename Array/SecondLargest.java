package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int index = i + 1;
            System.out.print("Enter the " + index + " value: ");
            array[i] = input.nextInt();
        }
        input.close();
        sorting(array);
        System.out.println("Second largest value is " + array[length - 2]);
    }

    static void sorting(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
