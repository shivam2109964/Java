package Array.Problems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 5, 4, 8, 16, 9, 7, 41, 5, 48, 44 };
        int search = 19;
        int result = linearSearch(array, search);
        if(result != -1){
            System.out.println("Result is " + result);
        } else {
            System.out.println("Not find.");
        }
    }

    public static int linearSearch(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i + 1;
            }
        }
        return -1;
    }
}
