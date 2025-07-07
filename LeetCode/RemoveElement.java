package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int result = removeElement(array, val);
        System.out.println(result); 
    }

    public static int removeElement(int[] array, int val) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                array[k] = array[i];
                k++;
            }
        }
        return k;
    }
}
