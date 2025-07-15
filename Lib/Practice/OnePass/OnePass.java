package Lib.Practice.OnePass;

public class OnePass {
    public static void main(String[] args) {
        int[] array = { 12, 35, 1, 10, 34, 1 };
        int result = onePass(array);
        System.out.println(result);
    }

    public static int onePass(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                secondLargest = largest;
                largest = array[i];
            } else if (secondLargest < array[i] && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
