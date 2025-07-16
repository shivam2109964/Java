package Lib.Practice.OnePass;

public class Max {
    public static void main(String[] args) {
        int[] array = { 4, -1, 0, 23, 9 };
        int result = maxValue(array);
        System.out.println(result);
    }
    public static int maxValue(int[] array){
        int length = array.length;

        int max = 0;
        for(int i = 0; i < length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
