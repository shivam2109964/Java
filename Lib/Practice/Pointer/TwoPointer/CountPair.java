package Lib.Practice.Pointer.TwoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter the length of an array: ");
        int length = input.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            nums.add(input.nextInt());
        }

        System.out.print("Enter the target value: ");
        int target = input.nextInt();

        int result = countPairs(nums, target);
        System.out.println(result);
        input.close();
    }

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;
        int count = 0;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
