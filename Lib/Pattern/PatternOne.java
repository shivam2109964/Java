package Lib.Pattern;

import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = input.nextInt();    
        input.close();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
