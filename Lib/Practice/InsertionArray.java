package Lib.Practice;

public class InsertionArray {
    public static void main(String[] args) {
        int[] array = { 0, 2, 1, 2, 0 };
        insertionSort(array);
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
