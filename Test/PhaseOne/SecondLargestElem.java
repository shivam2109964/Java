package Test.PhaseOne;

public class SecondLargestElem {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int secLargest = secondLargestElement(array);
        System.out.println(secLargest);

    }

    public static int secondLargestElement(int[] array) {
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
