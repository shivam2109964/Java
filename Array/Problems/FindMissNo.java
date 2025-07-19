package Array.Problems;
public class FindMissNo {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5 };
        int result = findMissingNum(array);
        System.out.println(result);
    }

    public static int findMissingNum(int[] array) {
        int len = array.length + 1;

        int total = len * (len + 1) / 2;
        int sum = 0;
        for (int x : array) {
            sum += x;
        }

        return total - sum;
    }

    public static int byHashing(int[] array) {
        int len = array.length;
        int[] hash = new int[len + 1];
        for (int i = 0; i < len; i++) {
            hash[array[i]]++;
        }
      

        for (int i = 1; i <= len; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
