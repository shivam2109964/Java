package Test.PhaseOne;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        findMaxAndMin(array);
    }

    public static void findMaxAndMin(int[] array) {
        int len = array.length;

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < len; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max value is: " + max);
        System.out.println("Min Value is: " + min);
    }
}
