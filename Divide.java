import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int value = input.nextInt();

        System.out.println("Enter the second Number");
        int value_one = input.nextInt();

        int total = value / value_one;

        System.out.println("The result is " + total);
        
        input.close();
    }
}
