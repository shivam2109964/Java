package Lib.Practice.Pointer;

import java.util.ArrayList;

public class ReverseWordAgain {
    public static void main(String[] args) {
        String data = "I love Java";
        reverseStringAgain(data);
    }

    public static void reverseStringAgain(String data) {
        String[] array = data.split(" ");
        ArrayList<String> rev = new ArrayList<>();
        for (String value : array) {
            char[] word = value.toCharArray();
            int left = 0;
            int right = word.length - 1;
            while (left < right) {
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++;
                right--;
            }
            String convert = new String(word);
            rev.add(convert);
        }
        System.out.println(rev);
    }
}
