package Lib.TenK.Array1430;

public class AccessArrayOne {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int index = 9;
        int result = accessElement(array, index);
        if (result != -1) {
            System.out.println(result);
        } else{
            System.out.println("Invalid Index");
        }
    }

    public static int accessElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return -1;
        }
        return array[index];
    }
}
