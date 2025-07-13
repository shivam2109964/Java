package Lib.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] array = { 16, 17, 4, 3, 5, 2 };
        leadersInArray(array);
    }

    public static void leadersInArray(int[] array) {
        int length = array.length;
        int maxFromRight = array[length - 1];

        List<Integer> leaders = new ArrayList<>();
        leaders.add(maxFromRight);

        for (int i = length - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
