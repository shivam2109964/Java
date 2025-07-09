package LeetCode;

import java.util.Arrays;

public class MergeSortedArrayB {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        mergeSortedArray(nums1, nums2, m, n);    
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeSortedArray(int[] numes1, int[] numes2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(j >= 0){
            if(i >= 0 && numes1[i] > numes2[j]){
                numes1[k--] = numes1[i--];
            } else{
                numes1[k--] = numes2[j--];
            }
        }
    }

}
