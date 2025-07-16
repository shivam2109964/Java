package LeetCode;

import java.util.HashMap;

public class MostFreqElem {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 2, 4, 4, 1 };
        int result = mostFreqElem(array);
        System.out.println(result);
    }

    public static int mostFreqElem(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int result = -1;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq || (freq == maxFreq && key < result)) {
                maxFreq = freq;
                result = key;
            }
        }
        return result;
    }

}
