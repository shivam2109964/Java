package Array.Problems;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = { 45, 78, 96, 48, 21, 46, 35, 28, 71, 65, 84, 92, 64 };
        int result = findLargestElement(array);
        System.err.println("Largest Element is: " + result);
        int resultOne = largest(array);
        System.out.println("Largest Element is: " + resultOne);
    }

    public static int largest(int[] array) {
        return findLargestElementRec(array, 0);
    }

    public static int findLargestElementRec(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        }
        int recMax = findLargestElementRec(array, i + 1);
        return Math.max(recMax, array[i]);
    }

    public static int findLargestElement(int[] array) {
        int length = array.length;
        int max = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
