package Lib.Practice.Pointer;

import java.util.ArrayList;

public class ReverseArrayA {
    public static void main(String[] args) {
        String data = "I love Java";
        System.out.println(reverseString(data));
    }

    public static String reverseString(String data) {
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

        ArrayList<String> newArray = new ArrayList<>();

        for (String value : array) {
            char[] word = value.toCharArray();
            int newLeft = 0;
            int newRight = word.length - 1;
            while (newLeft < newRight) {
                char newTemp = word[newLeft];
                word[newLeft] = word[newRight];
                word[newRight] = newTemp;
                newLeft++;
                newRight--;
            }

            String convertString = new String(word);
            newArray.add(convertString);
        }
        return newArray.toString();
    }
}
