package Array;

import java.util.Arrays;

public class BinarySe_Iterative {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5 };
        int length = array.length;
        int search = 5;
        insertionSort(array, length);
        System.out.println(Arrays.toString(array));
        System.out.println("");
        int result = binarySearch(array, search, 0, length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] array, int search, int low, int high) {
        // Reapeat until pointer low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (search == array[mid]) {
                return mid;
            }
            if (search > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
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
