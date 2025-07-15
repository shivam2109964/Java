package LeetCode;

public class Prob2798 {
    public static void main(String[] args) {
        int[] hours = { 0, 1, 2, 3, 4 };
        int result = employrr(hours, 2);
        System.out.println(result);
    }

    public static int employrr(int[] hours, int target) {
        int count = 0;
        for(int h : hours){
            if(h >= target){
                count++;
            }
        }
        return count;
    }
}