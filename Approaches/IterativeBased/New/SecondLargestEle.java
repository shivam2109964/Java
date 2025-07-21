package Approaches.IterativeBased.New;

public class SecondLargestEle {
    public static void main(String[] args) {
        int[] array = { 41, 52, 15, 46, 5, 36, 13, 24, 26 };
        int result = secondLargest(array);
        System.out.println(result);
    }

    public static int secondLargest(int[] array) {
        int len = array.length;

        int largest = 0;
        int secondLargest = 0;

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
