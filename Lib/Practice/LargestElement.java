package Lib.Practice;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = { 2, 52, 47, 96, 85, 4, 1, 3, 5, 4 };
        int result = secondLargest(array);
        System.out.println(result);
    }

    public static int secondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
