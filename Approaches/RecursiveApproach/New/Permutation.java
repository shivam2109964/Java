package Approaches.RecursiveApproach.New;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        generatePermutations(array, 0);
    }

    public static void generatePermutations(int[] array, int index) {
        if (index == array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }

        // Try every element in the current position
        for (int i = index; i < array.length; i++) {
            swap(array, index, i);

            generatePermutations(array, index + 1);

            swap(array, index, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
