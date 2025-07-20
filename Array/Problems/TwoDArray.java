package Array.Problems;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        int target = 8;
        boolean result = bruteF(array, target);
        boolean optimalSearch = searchOptimize(array, target);
        System.out.println(result);
        System.out.println(optimalSearch);
    }

    public static boolean searchOptimize(int[][] array, int target) {
        int n = array.length;
        int m = array[0].length;

        int low = 0;
        int high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;

            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static boolean bruteF(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
