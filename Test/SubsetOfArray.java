package Test;

import java.util.HashSet;
import java.util.Set;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] arrayOne = { 2, 4, 5 };
        boolean result = subsetOfArray(array, arrayOne);
        System.out.println(result);
    }

    public static boolean subsetOfArray(int[] array, int[] arrayOne) {
        Set<Integer> set = new HashSet<>();
        for (int arr : array) {
            set.add(arr);
        }

        for (int arr : arrayOne) {
            if (!set.contains(arr))
                return false;
        }
        return true;
    }
}
