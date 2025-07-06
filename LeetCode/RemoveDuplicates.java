package LeetCode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result = removeDuplicates(array);
        System.out.println("result = " + result);
        for(int i = 0; i < result; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] array) {
        if(array.length == 0) return 0;

        int i = 0;
        for(int j = 1; j < array.length; j++){
            if(array[j] != array[i]){
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
