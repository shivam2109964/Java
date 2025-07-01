package Array.Problems;

// Given an array arr. The task is to find the largest element in the given array. 
public class ProblemOne {
    public static void main(String[] args) {
        int[] array = { 10, 324, 45, 90, 8 };
        // Iterative Approach
        System.out.println("Largest element: " + largest(array));
        // Recursive Approach
        System.out.println("Largest element by rec approach: " + largestRec(array));
    }

    public static int largestRec(int[] array) {
        return findMax(array, 0);
    }

    public static int findMax(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }
        int recMax = findMax(array, index + 1);
        return Math.max(recMax, array[index]);
    }

    public static int largest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
