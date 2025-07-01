package Array.Problems;

// Given an array arr. The task is to find the largest element in the given array. 
public class ProblemOne {
    public static void main(String[] args) {
        int[] array = { 10, 324, 45, 90, 9808 };
        System.out.println("Largest element: " + largest(array));
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
