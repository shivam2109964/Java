package Array.Problems;

public class SearchElem {
    public static void main(String[] args) {
        int[] array = { 45, 85, 47, 96, 54, 15, 36, 75, 94 };
        int result = largest(array);
        System.out.println(result);
    }

    public static int largest(int[] array) {
        return findLargestRec(array, 0);
    }

    public static int findLargestRec(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        }

        int recMax = findLargestRec(array, i + 1);
        return Math.max(recMax, array[i]);
    }
}
