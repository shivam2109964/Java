package Approaches.IterativeBased.New;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] array = { 1, -2, 3, 4, -1, 2, 1, -5, 4 };
        int result = kadaneAlgo(array);
        System.out.println(result);
    }

    public static int kadaneAlgo(int[] array) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int arr : array) {
            currSum = currSum + arr;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
