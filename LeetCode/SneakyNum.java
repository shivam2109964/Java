package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SneakyNum {
    public static void main(String[] args) {
        int[] array = { 0, 3, 2, 1, 3, 2 };
        int[] res = getSneakyNumbers(array);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                list.add(num);
            }
            seen.add(num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
