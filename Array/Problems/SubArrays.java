package Array.Problems;

import java.util.ArrayList;

public class SubArrays {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        subArray(array);
    }

    public static void subArray(ArrayList<Integer> arr) {
        int n = arr.size();

        // Pick Starting Point
        for (int i = 0; i < n; i++) {
            // Pick Ending Point
            for (int j = i; j < n; j++) {
                // print sub arrays
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
        }
    }
}
