package Approaches.IterativeBased;

import java.util.Scanner;

// Prime Number check 
public class ProblemSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check prime no: ");
        int value = input.nextInt();
        boolean result = checkPrimeNo(value);
        if (result == true) {
            System.out.println(value + " It's a prime no");
        } else {
            System.out.println("Its not a prime");
        }
        input.close();
    }

    public static boolean checkPrimeNo(int value) {
        if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
