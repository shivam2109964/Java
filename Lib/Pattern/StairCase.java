package Lib.Pattern;

public class StairCase {
    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }

  
    public static void staircase(int n) {
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                System.out.print("*");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }           
            System.out.println("");
        }
    }
}
