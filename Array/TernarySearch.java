package Array;

public class TernarySearch {
    public static int ternarySearch(int[] array, int search, int low, int high){
        if(low > high){
            return -1;
        }
        int mid1 = low + (high - low) / 3;
        int mid2 = high - (high - low) / 3;

        if(array[mid1] == search){
            return mid1;
        }
        if(array[mid2] == search){
            return mid2;
        }
        if(search < array[mid1]){
            return ternarySearch(array, search, low, mid1 - 1);
        } else if(search > array[mid2]){
            return ternarySearch(array, search, mid2 + 1, high);
        } else{
            return ternarySearch(array, search, mid1 + 1, mid2 - 1);
        }
    }
    public static void main(String[] args) {
        int[] array = { 2, 4, 10, 15, 20, 26, 32, 40, 50 }; // Sorted Array
        int key = 15;
        int result = ternarySearch(array, key, 0, array.length - 1);

        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
