package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonInBoth {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        int[] arrOne = { 2, 2 };
        List<Integer> result = commonInBoth(arr, arrOne);
        System.out.println(result);
    }

    public static List<Integer> commonInBoth(int[] arr, int[] arrOne) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arrOne) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result.add(num);
                freq.put(num, freq.get(num) - 1); // reduce count
            }
        }
        return result;
    }
}
