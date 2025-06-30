package Array.OperationOnArray;

import java.util.ArrayList;

public class DeletionInArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4, 69);
        System.out.println(array);
        // Deletion in Array
        array.remove(4);
        array.removeLast();
        array.removeFirst();
        System.out.println(array);
    }
}
