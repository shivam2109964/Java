package Lib.Practice.OnePass;

public class Sum {
    public static void main(String[] args) {
        int[] array = { 4, -1, 0, 23, 9 };
        int result = sumOfValue(array);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Array is Empty");
        }
    }

    public static int sumOfValue(int[] array) {
        // Array length
        if (array.length == 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
