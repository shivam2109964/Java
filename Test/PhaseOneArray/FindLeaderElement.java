package Test.PhaseOneArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLeaderElement {
    public static void main(String[] args) {
        int[] array = { 16, 17, 4, 3, 5, 2 };
        leaderInArray(array);
    }

    public static void leaderInArray(int[] array) {
        int len = array.length;
        List<Integer> list = new ArrayList<>();
        int max = array[len - 1];

        list.add(max);

        for (int i = len - 2; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
