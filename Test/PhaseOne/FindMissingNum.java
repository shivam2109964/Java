package Test.PhaseOne;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] array = { 56, 57, 58, 59, 61, 62, 63, 64 };
        int result = findMissingNum(array);
        System.out.println(result);
    }

    public static int findMissingNum(int[] array) {
        int start = array[0];
        int end = array[array.length - 1];
        int expectedSum = ((end - start + 1) * (start + end)) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }
}
