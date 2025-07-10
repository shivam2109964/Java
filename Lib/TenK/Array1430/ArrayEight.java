package Lib.TenK.Array1430;

public class ArrayEight {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int index = 1;
        int result = arrayAccessIndex(array, index);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }
    }

    public static int arrayAccessIndex(int[] array, int index) {
        if (index < 0 || index > array.length) {
            return -1;
        }
        return array[index];
    }
}
