package Lib.Pattern;

public class PatternEight {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 2 * n - i - 1; j++){
                System.out.print("* ");
            }
            
                System.out.println(" ");
        }
    }
}
