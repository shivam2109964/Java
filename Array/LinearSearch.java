package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 2, 5, 6, 1, 7, 9, 4 };
        int key = 9;
        int result = linearSearch(key, array.length, array);
        if (result != -1) {
            System.out.println("Element found at position " + result);
        } else {
            System.out.println("Element not found");
        }

    }

    public static int linearSearch(int key, int length, int[] array) {
        for (int i = 0; i < length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
