package Lib.Practice.OnePass;

public class OnePassB {
    public static void main(String[] args) {
        int[] array = { 10, 3, 5, 6, 20 };
        int result = maximumProduct(array);
        System.out.println(result);
    }

    public static int maximumProduct(int[] array) {
        int length = array.length;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            if (array[i] > first) {
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] > second) {
                third = second;
                second = array[i];
            } else if (array[i] > third) {
                third = array[i];
            }
        }
        return first * second * third;
    }
}
