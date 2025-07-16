package Lib.Practice.Pointer;

public class ReverseWord {
    public static void main(String[] args) {
        String data = "I love Java";
        String result = reverseWord(data);
        System.out.println(result);
    }

    public static String reverseWord(String data) {
        String[] array = data.split(" ");

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        String value = String.join(" ", array);
        return value;
    }
}
