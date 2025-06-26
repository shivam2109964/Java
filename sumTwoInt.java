import java.util.Scanner;

public class sumTwoInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int value = input.nextInt();
        int value_One = input.nextInt();
        int result = value + value_One;
        System.out.println(value + " + " + value_One + " = " + result);
        input.close();
    }
}
