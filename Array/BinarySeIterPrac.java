package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySeIterPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int legnth = input.nextInt();
        int[] array = new int[legnth];
        for (int i = 0; i < legnth; i++) {
            System.out.print("Enter the " + (i + 1) + " value: ");
            array[i] = input.nextInt();
        }
        insertionSort(array, legnth);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the value you search for: " );
        int search = input.nextInt();
        int result = binarySearchIter(array, search, 0, legnth - 1);
        if(result != -1){
            System.out.print("Match is found at index: " + result);
        } else {
            System.out.print("Match is not found");
        }
        input.close();
    }

    public static int binarySearchIter(int[] array, int search, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (search == array[mid]) {
                return mid;
            }
            if(search < array[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void insertionSort(int[] array, int legnth) {
        for (int i = 1; i < legnth; i++) {
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
