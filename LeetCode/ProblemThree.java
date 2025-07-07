package LeetCode;

public class ProblemThree {
    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result = removeDuplicates(array);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        // Two pointer approach
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
