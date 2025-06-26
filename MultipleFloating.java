import java.util.Scanner;

public class MultipleFloating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        float value = input.nextFloat();
        float valueOne = input.nextFloat();
        float result = value * valueOne;
        System.out.println(value + " * " + valueOne + " = " + result);
        input.close();
    }
}
