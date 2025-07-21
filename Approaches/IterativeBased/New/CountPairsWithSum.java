package Approaches.IterativeBased.New;

import java.util.HashMap;

public class CountPairsWithSum {
    public static void main(String[] args) {
        int[] input = { 1, 5, 7, -1, 5 };
        int target = 6;
        int result = countPairs(input, target);
        System.out.println(result);
    }

    public static int countPairs(int[] array, int target) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int count = 0;
        for (int num : array) {
            int compliment = target - num;

            if (freqMap.containsKey(compliment)) {
                count += freqMap.get(compliment);
            }
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
