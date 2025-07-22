package Test.PhaseOneArray;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] array = { 2, 3, -8, 7, -1, 2, 3 };
        int result = kadaneAlgo(array);
        System.out.println(result);
    }

    public static int kadaneAlgo(int[] array) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int arr : array) {
            currentSum += arr;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return currentSum;
    }
}
