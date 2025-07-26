package Test.PhaseOne;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfEachElem {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 0, 2, 1, 0, 1, 0, 2, 0, 3, 1, 0 };
        countFreqOfEachElem(array);
    }

    public static void countFreqOfEachElem(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int arr : array) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        System.out.println(map);
    }
}
