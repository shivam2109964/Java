package Test.PhaseOneArray;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 44, 5, 6, 7 };
        boolean result = isSorted(array);
        if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
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
