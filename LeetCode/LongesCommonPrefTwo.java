package LeetCode;

public class LongesCommonPrefTwo {
    public static void main(String[] args) {
        String[] arrays = { "aaa", "aa", "aaa" };
        String result = longestCommonPrefTwo(arrays);
        System.out.println(result);
    }

    public static String longestCommonPrefTwo(String[] arrays) {
        if (arrays.length == 0)
            return "";

        String prefix = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            while (!arrays[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
