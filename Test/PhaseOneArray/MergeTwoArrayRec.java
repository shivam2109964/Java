package Test.PhaseOneArray;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrayRec {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int[] arrayOne = { 2, 4, 6, 8 };
        List<Integer> merged = mergeRecursive(array, 0, arrayOne, 0);
        System.out.println(merged);
    }

    public static List<Integer> mergeRecursive(int[] array, int i, int[] arrayOne, int j) {
        if (i == array.length) {
            List<Integer> remaining = new ArrayList<>();
            while (j < arrayOne.length) {
                remaining.add(arrayOne[j++]);
            }
            return remaining;
        }

        if (j == arrayOne.length) {
            List<Integer> remaining = new ArrayList<>();
            while (i < arrayOne.length) {
                remaining.add(arrayOne[i++]);
            }
            return remaining;
        }

        // Recursive step
        List<Integer> merged = new ArrayList<>();
        if (array[i] <= arrayOne[j]) {
            merged.add(array[i]);
            merged.addAll(mergeRecursive(array, i + 1, arrayOne, j));
        } else {
            merged.add(arrayOne[j]);
            merged.addAll(mergeRecursive(array, i, arrayOne, j + 1));
        }
        return merged;
    }
}
