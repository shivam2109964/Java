package Lib.Practice.OnePass;

public class ThreePass {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int result = threePass(array);
        System.out.println(result);
    }

    public static int threePass(int[] array) {
        int length = array.length;
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (first < array[i]) {
                first = array[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (second < array[i] && array[i] < first) {
                second = array[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (third < array[i] && array[i] < second) {
                third = array[i];
            }
        }
        return third;
    }
}
