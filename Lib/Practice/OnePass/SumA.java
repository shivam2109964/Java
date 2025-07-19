package Lib.Practice.OnePass;

import java.util.ArrayList;
import java.util.List;

public class SumA {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(10);
        ar.add(11);
        int result = simpleArraySum(ar);
        System.out.println(result);
    }

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}
