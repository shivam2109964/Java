package Approaches.IterativeBased.New;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] array = { 8, 2, 4, 5, 3, 7, 1 };
        int result = findMissing(array);
        System.out.println(result);
    }

    public static int findMissing(int[] array) {
        int len = array.length;
        int n = len + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int arr : array) {
            sum += arr;
        }
        return total - sum;
    }
}
