package Approaches.RecursiveApproach.New;

public class CountNumbers {
    public static void main(String[] args) {
        int[] array = { 2, 12, 5, 17, 3 };
        int k = 10;
        int result = countNumbers(array, k, 0);
        System.out.println(result);
    }

    public static int countNumbers(int[] array, int k, int i) {
        if (i == array.length) {
            return 0;
        }

        int count = (array[i] > k) ? 1 : 0;
        return count + countNumbers(array, k, i + 1);
    }
}
