package Array.Problems;

import java.util.HashMap;
import java.util.Map;

public class AppearOnce {
    public static void main(String[] args) {
        int[] array = { 4, 1, 2, 1, 2 };
        int result = appearOnce(array);
        System.out.println(result);
    }

    public static int appearOnce(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int value : map.keySet()) {
            if (map.get(value) == 1) {
                return value;
            }
        }
        return -1;
    }

    public static int xorSol(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
