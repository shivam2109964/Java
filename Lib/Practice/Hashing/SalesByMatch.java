package Lib.Practice.Hashing;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        int result = salesByMatch(ar);
        System.out.println(result);
    }

    public static int salesByMatch(int[] ar) {
        Map<Integer, Integer> salesMap = new HashMap<>();

        for (int num : ar) {
            salesMap.put(num, salesMap.getOrDefault(num, 0) + 1);
        }

        int totalParis = 0;

        for (int count : salesMap.values()) {
            totalParis += count / 2;
        }
        return totalParis;
    }
}