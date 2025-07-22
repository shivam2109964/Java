package Approaches.RecursiveApproach.New;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 10, 40 };
        int target = 10;
        int len = array.length;
        int result = recursiveBinarySearch(array, target, 0, len - 1);
        System.out.println(result);
    }

    public static int recursiveBinarySearch(int[] array, int target, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                return recursiveBinarySearch(array, target, low, mid - 1);
            } else {
                return recursiveBinarySearch(array, target, mid + 1, high);
            }
        }
        return -1;
    }
}
