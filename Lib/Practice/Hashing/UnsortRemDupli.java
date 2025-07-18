package Lib.Practice.Hashing;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnsortRemDupli {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 4, 1, 5 };
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }

}
