package Approaches.IterativeBased;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Print Even Numbers from 1 to N
// Input: N = 10
// Output: 2 4 6 8 10

public class ProblemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N value to print n even numbers: ");
        int nValue = input.nextInt();
        List<Integer> rec = evenNumbers(nValue);
        System.out.println(rec);
        input.close();
    }

    public static List<Integer> evenNumbers(int nValue) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= nValue; i++) {
            if (i % 2 == 0) {
                array.add(i);
            }
        }
        return array;
    }
}
