package Array.Problems;

public class ProblemTwo {
    public static void main(String[] args) {
        int[] array = { 3, 10, 10, 10 };
        int result = secondLargestElem(array, array.length - 1);
        System.out.println("Second Largest element is " + result);
        int resultTwo = getSecondByTwoPass(array);
        System.out.println("Second Largest By Two Pass: " + resultTwo);
        int resultThree = secondLargestByOnePass(array);
        System.out.println("Second Largest By One Pass: " + resultThree);

    }

    public static int secondLargestByOnePass(int[] array) {
        int length = array.length;
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] < largest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int secondLargestElem(int[] array, int length) {
        insertionSort(array, length);
        for (int i = length - 2; i >= 0; i--) {
            if (array[i] != array[length - 1]) {
                return array[i];
            }
        }
        return -1;
    }

    public static int getSecondByTwoPass(int[] array) {
        int length = array.length;
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static void insertionSort(int[] array, int length) {
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
