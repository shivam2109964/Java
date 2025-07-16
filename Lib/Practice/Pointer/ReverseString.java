package Lib.Practice.Pointer;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        String result = reverseString(s);
        System.out.println(result);
    }

    public static String reverseString(String s) {
        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        String reversed = new String(array);
        return reversed;
    }
}
