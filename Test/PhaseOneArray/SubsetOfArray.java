package Test.PhaseOneArray;

import java.util.Arrays;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        printSubArray(array, 0, 0);
        
    }

    public static void printSubArray(int[] array, int start, int end) {
        // Base Case:
        if (start == array.length) {
            return;
        }

        // If end < array len
        if (end < array.length) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, start, end + 1)));
            printSubArray(array, start, end + 1);
        } else {
            printSubArray(array, start + 1, start + 1);
        }
    }
}
