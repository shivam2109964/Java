package Test.PhaseOneArray;

public class FindMaxByRec {
    public static void main(String[] args) {
        int[] array = { 52, 41, 47, 85, 96, 98, 65, 16 };
        int result = findMax(array, 0);
        System.out.println(result);
    }

    public static int findMax(int[] array, int i) {
        if (array.length - 1 == i) {
            return array[i];
        }

        int maxRec = findMax(array, i + 1);

        return Math.max(maxRec, array[i]);
    }
}
