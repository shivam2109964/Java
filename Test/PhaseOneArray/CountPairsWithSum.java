package Test.PhaseOneArray;

import java.util.HashMap;

public class CountPairsWithSum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, -1 };
        int target = 5;
        int result = countPairsWithSum(array, target);
        System.out.println(result);
    }

    public static int countPairsWithSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pair = 0;

        for (int arr : array) {
            int compliment = target - arr;

            if (map.containsKey(compliment)) {
                pair += map.get(compliment);
            }
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }
        return pair;
    }
}
