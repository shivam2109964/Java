package LeetCode;

public class ArrayRef {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] copyArray = array;

        System.out.println("Original Array");
        printArray(array);
        System.out.println("Copied Array");
        printArray(copyArray);

        copyArray[0] = 0;
        copyArray[1] = 0;

        System.out.println("New OG Array");
        printArray(array);
        System.out.println("Updated Copy Array");
        printArray(copyArray);
        System.out.println();

        int a = 123;
        a = changeValue(a);
        System.out.println(a);
    }

    public static int changeValue(int x){
        x = 96;
        return x;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
