package Array.Problems;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 2, 3, 3 };
        int index = removeDuplicate(array);
        for(int i = 0; i < index; i++){
            System.out.print(array[i]);
        }
    }

    public static int removeDuplicate(int[] array) {
        int len = array.length;

        int i = 0;

        for (int j = 1; j < len; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
