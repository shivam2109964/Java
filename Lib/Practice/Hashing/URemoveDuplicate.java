package Lib.Practice.Hashing;

import java.util.LinkedHashSet;
import java.util.Set;

public class URemoveDuplicate {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 2, 4, 1, 5 };
        Set<Integer> set = new LinkedHashSet<>(); // Preserve Order

        for (int num : array) {
            set.add(num);
        }

        System.out.println(set);
    }
}
