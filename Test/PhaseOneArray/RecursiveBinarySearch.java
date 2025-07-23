package Test.PhaseOneArray;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = { 25, 14, 36, 98, 74, 51, 36, 45, 97, 65, 13 };
        int target = 51;
        int result = recursiveBinarySearch(array, target, 0, array.length - 1);
        System.out.println(result);
    }

    public static int recursiveBinarySearch(int[] array, int target, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (target < array[mid]) {
                recursiveBinarySearch(array, target, low, mid - 1);
            } else {
                recursiveBinarySearch(array, target, mid + 1, high);
            }
        }
        return -1;
    }
}
