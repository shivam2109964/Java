package Array;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int index = i + 1;
            System.out.print("Enter the " + index + " Element: ");
            array[i] = input.nextInt();
        }
        input.close();

        int result = sumOfAllEle(array);
        System.out.println("The sum of all element is " + result);
    }

    static int sumOfAllEle(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
