package Lib.Practice.String;

import java.util.HashSet;
import java.util.Set;

public class PracA {
    public static void main(String[] args) {
        String value = "programming";
        String result = valuee(value);
        System.out.println(result);
    }

    public static String valuee(String value) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : value.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}