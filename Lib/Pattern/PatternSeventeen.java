package Lib.Pattern;

public class PatternSeventeen {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j = i; j >= 2; j--){
                System.out.print(j - 1 );
            }
            System.out.println();
        }
    }
}
