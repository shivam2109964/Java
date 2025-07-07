package LeetCode;

public class SearchInsertionPos {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6 };
        int target = 7;
        int result = searchInsertionPos(array, target);
        System.out.println(result);
    }

    public static int searchInsertionPos(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
       return low;
    }
}
