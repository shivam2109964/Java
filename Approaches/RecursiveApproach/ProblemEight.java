package Approaches.RecursiveApproach;
// Reverse a String Recursively
import java.util.Scanner;

public class ProblemEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String value: ");
        String str = input.nextLine();
        reverseString(str, str.length() - 1);
        input.close();
    }

    public static void reverseString(String str, int index) {
        if(index < 0){
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);

    }
}
