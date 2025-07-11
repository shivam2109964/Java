package Lib.TenK.Array1430;

public class AccessArrayThree {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int index = 3;
        int result = accessArray(array, index);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }
    }

    public static int accessArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return -1;
        }
        return array[index];
    }
}
