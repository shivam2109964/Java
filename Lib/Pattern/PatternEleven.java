package Lib.Pattern;

public class PatternEleven {
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
            System.out.print(x + " ");
            x = 1 - x;
            }
            System.out.println(" ");
        }
    }
}
