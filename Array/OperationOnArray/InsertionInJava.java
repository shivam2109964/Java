package Array.OperationOnArray;

import java.util.ArrayList;

public class InsertionInJava {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println(array);
        int element = 50;
        System.out.println("Adding element in x place");
        array.add(3, element);
        System.out.println("New Array: " + array);
    }
}
