package Test.PhaseOneArray;

public class ReverseArrayByRec {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(array, 0);
    }

    public static void reverse(int[] array, int i) {
        if (array.length == i) {
            return;
        }

        reverse(array, i + 1);
        System.out.print(array[i] + " ");
    }
}
