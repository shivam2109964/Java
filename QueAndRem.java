import java.util.Scanner;

public class QueAndRem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter dividend: ");
        int numerator = input.nextInt();
        System.out.print("Enter divisor: ");
        int denominator = input.nextInt();

        int forQue = numerator / denominator;
        int forRem = numerator % denominator;

        System.out.println("Quotient " + forQue);
        System.out.println("Remainder " + forRem);
        input.close();

    }
}
