import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int value = input.nextInt();

        System.out.println("You entered: " + value);

        input.close();
    }
}
