package Array.Problems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = { 25, 14, 47, 58, 9, 66, 65, 32, 43 };
        int result = secondLargest(array);
        System.out.println(result);
    }

    public static int secondLargest(int[] array) {
        int len = array.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
