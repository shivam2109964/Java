package Approaches.RecursiveApproach.New;

public class FindMax {
    public static void main(String[] args) {
        int[] array = { 25, 41, 68, 74, 65, 49 };
        int result = findMax(array, 0);
        System.out.println(result);
    }

    public static int findMax(int[] array, int i) {
        if (i == array.length - 1)
            return array[i];

        int recMax = findMax(array, i + 1);
        return Math.max(recMax, array[i]);
    }
}
