package Approaches.IterativeBased.New;

public class LongestIncreaseSub {
    public static void main(String[] args) {
        int[] array = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };
        int result = findLongestIncreasingSub(array);
        System.out.println(result);
    }

    public static int findLongestIncreasingSub(int[] array) {
        if (array.length == 0)
            return 0;

        int max = -1;
        int len = -1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                len++;
            } else {
                max = Math.max(max, len);
                len = 1;
            }
        }
        max = Math.max(max, len);
        return max;
    }
}
