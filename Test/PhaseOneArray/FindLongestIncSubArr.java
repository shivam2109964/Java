package Test.PhaseOneArray;

public class FindLongestIncSubArr {
    public static void main(String[] args) {
        int[] array = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };
        int result = longestIncSubArr(array);
        System.out.println(result);
    }

    public static int longestIncSubArr(int[] array) {
        if (array.length == 0)
            return 0;

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }
}
