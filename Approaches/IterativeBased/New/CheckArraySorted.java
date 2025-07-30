package Approaches.IterativeBased.New;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] array = { 1, 2, 33, 4, 5, 6, 7 };
        boolean result = isSorted(array);
        System.out.println(result);
    }

    public static boolean isSorted(int[] array) {
        int len = array.length;

        for (int i = 1; i < len; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
