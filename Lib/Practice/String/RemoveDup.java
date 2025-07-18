package Lib.Practice.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        String s = "banana";
        String result = removeDuplicate(s);
        System.out.println(result);
    }

    public static String removeDuplicate(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
