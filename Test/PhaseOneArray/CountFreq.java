package Test.PhaseOneArray;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    public static void main(String[] args) {
        int[] array = { 2, 1, 1, 2, 3, 2, 1, 1, 4, 5, 2, 3, 2, 1, 4, 2, 3, 2, 1, 4 };
        countFreq(array);
    }

    public static void countFreq(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int arr : array) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        System.out.println(map);
    }
}
