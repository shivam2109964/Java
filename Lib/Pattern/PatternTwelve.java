package Lib.Pattern;

public class PatternTwelve {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
       
    }
}
