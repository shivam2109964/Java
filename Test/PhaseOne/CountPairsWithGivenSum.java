package Test.PhaseOne;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 10;
        countPairs(array, target);
    }

    public static void countPairs(int[] array, int target) {
        int len = array.length;

        int start = 0;
        int end = len - 1;

        while (start < end) {
            int sum = array[start] + array[end];
            if (sum == target) {
                System.out.println(array[start] + " + " + array[end]);
                start++;
                end--;
            } else if (target < sum) {
                start++;
            } else {
                end--;
            }
        }
    }

}
