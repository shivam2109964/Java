package LeetCode;

public class MooreVotingAlgo {
    public static void main(String[] args) {
        int[] array = { 2, 2, 1, 1, 1, 2, 2 };
        int result = mooreVotingAlgo(array);
        System.out.println(result);
    }

    public static int mooreVotingAlgo(int[] array) {
        int count = 0;
        int candidate = 0;
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
