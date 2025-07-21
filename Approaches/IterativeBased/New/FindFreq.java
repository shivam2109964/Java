package Approaches.IterativeBased.New;

import java.util.HashMap;

public class FindFreq {
    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 4, 5, 5, 8, 8, 7, 9, 6, 5, 9, 6, 3, 9, 9, 7, 4 };
        countFreq(array);
    }

    public static void countFreq(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int arr : array) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        System.out.println(map);
    }
}
