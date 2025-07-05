package Approaches.TowPointer;
// Check if Array is Sorted and Rotated
// Input: {3, 4, 5, 1, 2}
// Task: Return true if array is sorted and rotated.

public class ProblemOne {
    public static void main(String[] args) {
        int[] array = { 3, 4, 5, 1, 2 };
        boolean isTrue = isSortedAndRotated(array);
        System.out.println(isTrue);
    }

    public static boolean isSortedAndRotated(int[] array) {
        int n = array.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("i = " + ((i + 1) % n));
            if (array[i] > array[(i + 1) % n]) {
                count++;
            }
        }
        return count == 1;
    }
}
