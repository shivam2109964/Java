package Lib.TenK.Array1430;

import java.util.Scanner;

public class InsertStaticArrayB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();

        int[] array = new int[length];
        System.out.print("Enter the n size of elements: ");
        int n = input.nextInt();

        checkNSize(length, n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + ": value: ");
            array[i] = input.nextInt();
        }

        System.out.println("Enter the index value where you want to insert value");
        int index = input.nextInt();

        System.out.println("Enter the value of that index");
        int value = input.nextInt();

        int result = insertStaticArray(array, n, index, value);
        if(result != -1){
            System.out.println("Successful Insertion");
            for(int i = 0; i <= n; i++){
                System.out.println(array[i] + " ");
            }
        } else {
            System.out.println("Invalid");
        }
        input.close();

    }

    public static int insertStaticArray(int[] array, int n, int index, int value) {
        if (index < 0 || index > n || index == array.length) {
            return -1;
        }
        // shift element
        for (int i = n - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        return 1;
    }

    public static void checkNSize(int length, int n) {
        if (n > length) {
            System.out.print("Invalid initial length: exceeds array capacity: ");
            System.exit(1);
        }
    }
}
