package LeetCode;

import java.util.HashMap;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1 };
        int k = 3;
        boolean result = containDuplicate(array, k);
        System.out.println(result);
    }

    public static boolean containDuplicate(int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (map.containsKey(current)) {
                int prevIndex = map.get(current);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(current, i);
        }
        return false;
    }
}
