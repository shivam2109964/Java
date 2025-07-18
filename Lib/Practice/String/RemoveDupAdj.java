package Lib.Practice.String;

import java.util.Stack;

public class RemoveDupAdj {
    public static void main(String[] args) {
        String s = "aabbcc";
        String result = removeAdString(s);
        System.out.println(result);
    }

    public static String removeAdString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                continue;
            }
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack)
            sb.append(ch);
        return sb.toString();
    }
}
