package Test.PhaseOneArray;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 7 };
        int result = findMissingNum(array);
        System.out.println(result);
    }

    public static int findMissingNum(int[] array) {
        int len = array.length + 1;
        int total = len * (len + 1) / 2;
        int sum = 0;
        for (int arr : array) {
            sum += arr;
        }
        
        return total - sum;
    }
}
