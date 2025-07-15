package Lib.Practice.OnePass;

public class TwoPass {
    public static void main(String[] args) {
        int[] array = { 12, 35, 1, 10, 34, 1 };
        int result = secondLargest(array);
        System.out.println(result);
    }

    public static int secondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
