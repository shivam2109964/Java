package LeetCode;

public class PracticeThree {
    public static void main(String[] args) {
        String[] array = { "aaa", "aa", "aaa" };
        String result = longestCommonPrefix(array);
        System.out.println(result);

    }

    public static String longestCommonPrefix(String[] array) {
        if (array.length == 0) {
            return "";
        }
        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            while (!array[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
