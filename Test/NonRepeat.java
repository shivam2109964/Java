package Test;

import java.util.HashMap;
import java.util.Map;

public class NonRepeat {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 9, 6, 7, 4 };
        int result = nonRepeat(arr);
        System.out.println(result);
    }

    public static int nonRepeat(int[] arr) {
        if (arr.length < 1)
            return -1;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int num: arr){
            if(freq.get(num) == 1){
                return num;
            }
        }

        return -1;
    }
}
