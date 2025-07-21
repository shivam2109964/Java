package Approaches.IterativeBased.New;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = { 12, 41, 45, 85, 41, 20, 31, 25 };
        findMaxAndMin(array);
    }

    public static void findMaxAndMin(int[] array) {
        int len = array.length;

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < len; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
    }
}
