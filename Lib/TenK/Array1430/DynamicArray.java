package Lib.TenK.Array1430;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("How many initial elements? ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            list.add(input.nextInt());
        }

        System.out.print("Enter index to insert at: ");
        int index = input.nextInt();
        System.out.print("Enter value to insert: ");
        int value = input.nextInt();

        if (index < 0 && index > list.size()) {
            System.out.println("Invalid index!");
        } else {
            list.add(index, value);
            System.out.println("ArrayList after insertion: " + list);
        }
        input.close();
    }
}
