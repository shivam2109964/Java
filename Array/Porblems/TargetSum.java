package Array.Porblems;

public class TargetSum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 7, 11, 15 };
        int pointerOne = 0;
        int pointerTwo = array.length - 1;
        int target = 15;
        while (pointerOne < pointerTwo) {
            int sum = array[pointerOne] + array[pointerTwo];
            if (sum == target) {
                System.out.println("Pair found: " + array[pointerOne] + " + " + array[pointerTwo] + " = " + target);
                return;
            } else if (sum < target){
                pointerOne++;
            } else{
                pointerTwo--;
            }
        }
        System.out.println("No Pair found.");
    }
}
