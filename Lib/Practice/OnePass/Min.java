package Lib.Practice.OnePass;

public class Min {
    public static void main(String[] args) {
        int[] array = { 4, -1, 0, 23, 9 };
        int result = minimumValue(array);
        System.out.println(result);
    }

    public static int minimumValue(int[] array) {
        int length = array.length;

        int min = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
