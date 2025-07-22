package Approaches.IterativeBased.New;

import java.util.HashMap;

public class CountFreqSortedArray {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;
        int result = countFreqSortedArray(array, target);
        System.out.println(result);
    }

    public static int countFreqSortedArray(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int arr : array) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (key == 2) {
                return map.get(key);
            }
        }
        return -1;
    }
}
