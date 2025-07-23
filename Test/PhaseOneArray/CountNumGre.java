package Test.PhaseOneArray;

public class CountNumGre {
    public static void main(String[] args) {
        int[] array = { 2, 6, 3, 9, 1 };
        int k = 4;
        int result = countNumGre(array, k, 0);
        System.out.println(result);
    }

    public static int countNumGre(int[] array, int k, int i) {
        if (array.length == i)
            return 0;

        int count = (array[i] > k) ? 1 : 0;
        return count + countNumGre(array, k, i + 1);
    }
}
