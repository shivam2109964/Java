package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        int len = 9;
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);
        int result = sockMerchant(len, ar);
        System.out.println(result);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        if (n < 1)
            return -1;

        Map<Integer, Integer> map = new HashMap<>();
        for (int array : ar) {
            map.put(array, map.getOrDefault(array, 0) + 1);
        }
        int count = 0;
        System.out.println(map);
        for (int val : map.values()) {
            count += val / 2;
        }
        return count;
    }
}
