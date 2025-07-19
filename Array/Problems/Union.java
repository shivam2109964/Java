package Array.Problems;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] arrayOne = { 2, 3, 4, 4, 5 };

        Set<Integer> union = new HashSet<>();

        for(int num : array) union.add(num);
        for(int num: arrayOne) union.add(num);

        System.out.println(union);
    }
}