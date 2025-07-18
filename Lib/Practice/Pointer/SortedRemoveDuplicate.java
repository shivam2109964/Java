package Lib.Practice.Pointer;

public class SortedRemoveDuplicate {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 3, 4, 4 };
        int result = removeDuplicate(array);
        for (int i = 0; i < result; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicate(int[] array) {
        if (array.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
