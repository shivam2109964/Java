package Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[][][] array = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 },
                        { 12, 11, 12 }

                }
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("------");
        }
    }
}
