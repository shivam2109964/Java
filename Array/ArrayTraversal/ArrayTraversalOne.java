package Array.ArrayTraversal;

import java.util.Arrays;

public class ArrayTraversalOne {
    public static void main(String[] args) {
        int[] array = { 1, 5, 42, 63, 15, 64 };
        System.out.println("Print as a orignal Array");
        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println("Linear Traversal");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
