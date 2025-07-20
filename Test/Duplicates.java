package Test;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        boolean result = isDuplicate(array);
        System.out.println(result);
    }

    public static boolean isDuplicate(int[] array) {
        if (array.length < 1)
            return false;
        Set<Integer> seen = new HashSet<>();
        for(int arr : array){
            if(seen.contains(arr)) return true;
            seen.add(arr);
        }
        return false;
    }
}
