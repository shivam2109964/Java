package Lib.Practice.OnePass;

public class GreedyAlgo {
    public static void main(String[] args) {
        int[] array = { -10, -3, 5, 6, -20 };
        int result = maxProduct(array);
        System.out.println(result);
    }

    static int maxProduct(int[] array) {
        int length = array.length;

        // Initialize Maximum
        // Second maximum and third maximum element
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;

        // Initialize Minimum and second Minimum element
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            // Update Maximum, second Maximum
            if (array[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = array[i];
            } else if (array[i] > maxB) {
                maxC = maxB;
                maxB = array[i];
            } else if (array[i] > maxC) {
                maxC = array[i];
            }

            // Update Minimum and second Minimum
            if (array[i] < minA) {
                minB = minA;
                minA = array[i];
            } else if (array[i] < minB) {
                minB = array[i];
            }
        }
        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }
}
