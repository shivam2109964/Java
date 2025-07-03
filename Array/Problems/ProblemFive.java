package Array.Problems;

import java.util.HashSet;

public class ProblemFive {
    public static void main(String[] args) {
        int[] array = { 10, 5, 3, 4, 4, 3, 5, 6 };
        int length = array.length;
        int index = firstRepeatingElement(array, length);
        int indexOne = firstRepeatingElementByHash(array);

        if (index != -1 && indexOne != -1) {
            System.out.println("First repeating element is: " + array[index]);
            System.out.println("First repeating element is: " + array[indexOne]);
        } else {
            System.out.println("No repeating element is found.");
        }

    }

    static int firstRepeatingElementByHash(int[] array) {
        HashSet<Integer> res = new HashSet<>();
        int minEle = Integer.MAX_VALUE;
        for (int i = array.length - 1; i >= 0; i--) {
            if (res.contains(array[i])) {
                minEle = Math.min(minEle, i);
            }
            res.add(array[i]);
        }
        return minEle == Integer.MAX_VALUE ? -1 : minEle;
    }

    static int firstRepeatingElement(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
