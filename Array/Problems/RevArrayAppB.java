package Array.Problems;

public class RevArrayAppB {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        reverseArray(array, 0);
    }

    public static void reverseArray(int[] array, int i) {
        if (i == array.length) {
            return;
        }
        reverseArray(array, i + 1);
        System.out.print(array[i] + " ");
    }
}
