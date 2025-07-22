package Test.PhaseOneArray;

import java.util.HashMap;

public class CountOcc {
    public static void main(String[] args) {
        int[] array = { 1, 2, 1, 4, 5, 1, 2, 5, 4, 1, 2, 4, 3, 2, 1, 4, 5, 1, 2 };
        int target = 1;
        int result = countOcc(array, target);
        System.out.println(result);
    }

    public static int countOcc(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int arr : array) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (key == target) {
                return value;
            }
        }
        return 0;
    }
}
