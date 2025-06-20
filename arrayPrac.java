
import java.util.Scanner;

public class arrayPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");

        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the array element");
        for (int i = 0; i < length; i++) {

            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("My Array is that");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
