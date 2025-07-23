package Test.PhaseOneArray;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<>();

        genPermutations(array, 0, result);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    public static void genPermutations(int[] array, int index, List<List<Integer>> result) {
        if (index == array.length) {
            List<Integer> perm = new ArrayList<>();
            for (int num : array) {
                perm.add(num);
            }
            result.add(perm);
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(array, index, i);
            genPermutations(array, index + 1, result);
            swap(array, index, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
