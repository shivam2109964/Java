package Test.PhaseTwoArray;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] array = { 25, 14, 16, 32, 57, 89, 51, 21, 65 };
        findMaxAndMin(array);
    }

    // We need to play with Element by condition
    public static void findMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max Value = " + max);
        System.out.println("Min Value = " + min);
    }
}
