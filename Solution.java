import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] array = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZero(array);
        System.out.println(Arrays.toString(array));
    }

    public static void duplicateZero(int[] array) {
        int length = array.length;
        int possibleDuplicate = 0;
        int last = length - 1;

        for (int i = 0; i < last - possibleDuplicate; i++) {
            if (array[i] == 0) {
                if (i == last - possibleDuplicate) {
                    array[last] = 0;
                    last--;
                    break;
                }
                possibleDuplicate++;
            }
        }
    }
}
