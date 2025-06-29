package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " value: ");
            array[i] = input.nextInt();
        }
        insertionSort(array, length);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the value you search for: ");
        int search = input.nextInt();
        int result = binarySearchRec(array, search, 0, length - 1);
        if(result != -1){
            System.out.println("Match is found at index: " + result);
        } else{ 
            System.out.println("Match is not found");
        }
        input.close();

    }

    public static int binarySearchRec(int[] array, int search, int low, int high){
        if(low > high){
            return -1;
        }

        if(low == high){
            if(array[low] == search){
                return low;
            } else {
                return -1;
            }
        }
        if(low <= high){
            int mid = low + (high - low) / 2;
            if(search == array[mid]){
                return mid;
            } 
            if(search < array[mid]){
                return binarySearchRec(array, search, low, mid - 1);
            } else {
                return binarySearchRec(array, search, mid + 1, high);
            }
        }
        return -1;
    }

    public static void insertionSort(int[] array, int length) {
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
