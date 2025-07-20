package Array.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[] array = { 4, 7, 1, 0 };
        List<Integer> result = leaders(array);
        for(int val : result){
            System.out.print(val + " ");
        }
    }

    public static List<Integer> leaders(int[] array) {
        int len = array.length;
        List<Integer> result = new ArrayList<>();

        int maxFromRight = array[len - 1];
        result.add(maxFromRight);

        for (int i = len - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                result.add(maxFromRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
