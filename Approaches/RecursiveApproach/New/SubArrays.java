package Approaches.RecursiveApproach.New;

import java.util.ArrayList;

public class SubArrays {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        ArrayList<Integer> subset = new ArrayList<>();
        printSubset(array, 0, subset);
    }

    public static void printSubset(int[] array, int index, ArrayList<Integer> current) {
        if (index == array.length) {
            System.out.println(current);
            return;
        }

        printSubset(array, index + 1, current);
        current.add(array[index]);
        printSubset(array, index + 1, current);

        current.remove(current.size() - 1);
    }
}
