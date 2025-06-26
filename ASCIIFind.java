import java.util.Scanner;

public class ASCIIFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character to find its ASCII");
        char value = input.next().charAt(0);
        int convo = (int) value;
        System.out.println("The ASCII value of " + value + " is " + convo);
        input.close();
    }
}
