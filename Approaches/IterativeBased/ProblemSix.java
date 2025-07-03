package Approaches.IterativeBased;

import java.util.Scanner;

public class ProblemSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String value to reverse it: ");
        String value = input.nextLine();
        String result = revString(value);
        System.out.println("Reverse String is: " + result);
        System.out.println(value.length());
        input.close();
    }

    public static String revString(String value) {
        String rev = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            rev += value.charAt(i);
        }
        return rev;
    }
}
