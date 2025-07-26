package Test.PhaseOne;

import java.util.ArrayList;
import java.util.List;

public class FindLeaderElement {
    public static void main(String[] args) {
        int[] array = { 16, 17, 4, 3, 5, 2 };
        findLeaderElem(array);
    }

    public static void findLeaderElem(int[] array) {
        int len = array.length;
        int maxRight = array[array.length - 1];
        List<Integer> list = new ArrayList<>();
        list.add(maxRight);
        for (int i = len - 2; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                maxRight = array[i];
                list.add(maxRight);
            }
        }
        System.out.println(list);
    }
}
