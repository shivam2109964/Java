package Test.PhaseOneArray;

public class SecondLargestElem {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, };
        int result = findSecondLargest(array);
        System.out.println(result);
    }

    public static int findSecondLargest(int[] array) {
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
