package Lib;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 14, 26, 41, 02, 69, 85, 74, 13, 64, 45 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int result = Arrays.binarySearch(array, 69);
        System.out.println("Value found at index: " + result);
    }
}
