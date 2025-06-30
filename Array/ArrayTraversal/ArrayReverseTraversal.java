package Array.ArrayTraversal;

public class ArrayReverseTraversal {
    public static void main(String[] args) {
        int[] array = { 2, 4, 54, 42, 74, 31, 64, 642 };
        System.out.println("Reverse Array");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
