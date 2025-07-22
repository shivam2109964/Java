package Approaches.TowPointer.New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairOfSum {
    public static void main(String[] args) {
        int[] array = { -1, 1, 5, 5, 7 };
        int target = 6;

        List<List<Integer>> pairs = findAllPairs(array, target);
        if (pairs.isEmpty()) {
            System.out.println("No Pairs found");
        } else {
            for (List<Integer> pair : pairs) {
                System.out.println(pair.get(0) + " + " + pair.get(1) + " = " + target);
            }
        }
    }

    public static List<List<Integer>> findAllPairs(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = array.length - 1;

        while(start < end){
            int sum = array[start] + array[end];

            if(sum == target){
                result.add(Arrays.asList(array[start], array[end]));
                start++;
                end--;
            } else if( sum < target){
                start++;
            } else {
                end--;
            }
        }
        return result;
    }
}
