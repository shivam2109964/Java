package Approaches.IterativeBased.New;

import java.util.ArrayList;
import java.util.Collections;

public class FindLeader {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 2 };
        findLeader(array);
    }

    public static void findLeader(int[] array) {
        int len = array.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        int leader = array[len - 1];
        leaders.add(leader);

        for (int i = len - 2; i >= 0; i--) {
            if (array[i] > leader) {
                leader = array[i];
                leaders.add(leader);
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}
