package Array.Problems;

import java.util.ArrayList;
import java.util.List;

public class ProblemThree {
    public static void main(String[] args) {
        int[] array = { 12, 13, 1, 10, 34, 1 };
        List<Integer> res = getThreeLargest(array);
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static List<Integer> getThreeByTraverse(int[] array) {
        int length = array.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        if (largest < 0) {
            return res;
        }
        res.add(largest);

        for (int i = 0; i < length; i++) {
            if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        if (secondLargest < 0) {
            return res;
        }
        res.add(secondLargest);

        for (int i = 0; i < length; i++) {
            if (array[i] > thirdLargest && array[i] != secondLargest && array[i] != largest) {
                thirdLargest = array[i];
            }
        }
        if(thirdLargest < 0){
            return res;
        }
        res.add(thirdLargest);
        return res;
    }

    public static List<Integer> getThreeLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int x : array) {
            if (x > first) {
                third = sec;
                sec = first;
                first = x;
            } else if (x > sec && x != first) {
                third = sec;
                sec = x;
            } else if (x > third && x != sec && x != first) {
                third = x;
            }
        }
        List<Integer> res = new ArrayList<>();

        if (first == Integer.MIN_VALUE)
            return res;
        res.add(first);
        if (sec == Integer.MIN_VALUE)
            return res;
        res.add(sec);
        if (third == Integer.MIN_VALUE)
            return res;
        res.add(third);
        return res;
    }
}
