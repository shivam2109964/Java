package Approaches.RecursiveApproach;

import java.util.Scanner;

// Power of a Number (x^n)
public class ProblemFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x value: ");
        int x = input.nextInt();
        System.out.print("Enter the power of x: ");
        int n = input.nextInt();
        int result = power(x, n);
        input.close();
        System.out.println(result);
    }
 
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x , n - 1);
    }
}
