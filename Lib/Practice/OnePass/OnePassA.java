package Lib.Practice.OnePass;

public class OnePassA {
    public static void main(String[] args) {
        int[] arr = { 1, 14, 2, 16, 10, 20 };
        int result = thirdLargest(arr);
        System.out.println(result);
    }

    public static int thirdLargest(int[] array) {
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
        return third;
    }
}
