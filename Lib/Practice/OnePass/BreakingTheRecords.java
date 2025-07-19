package Lib.Practice.OnePass;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);
        List<Integer> result = breakingRecords(scores);
        System.out.println(result);
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int len = scores.size();
        int mini = scores.get(0);
        int max = scores.get(0);

        int countMin = 0;
        int countMax = 0;

        List<Integer> total = new ArrayList<>();

        for (int i = 1; i < len; i++) {
            if (scores.get(i) > max) {
                max = scores.get(i);
                countMax++;

            } else if (scores.get(i) < mini) {
                mini = scores.get(i);
                countMin++;
            }
        }
        total.add(countMax);
        total.add(countMin);
        return total;
    }
}
