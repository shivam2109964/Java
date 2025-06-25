import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int value = input.nextInt();
        System.out.println("Enter the second number: ");
        int value_one = input.nextInt();
        int sum = value + value_one;
        System.out.println("The result is " + sum);
        input.close();
    }
}
