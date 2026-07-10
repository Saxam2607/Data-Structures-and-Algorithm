package Array_Hard;

import java.util.*;

class Solution1 {
    private void swapIfGreater(int[] arr1, int[] arr2, int left, int right) {
        if (arr1[left] > arr2[right]) {
            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
    }
    public void merge_arrays_optimal1(int[] arr1, int[] arr2, int n, int m) {
        int left = n-1, right = 0;

        while(left >= 0 && right < m) {
            if(arr1[left] >= arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return;

    }
    public void merge_arrays_optimal2(int[] arr1, int[] arr2, int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < n && right < n) {
                    swapIfGreater(arr1, arr1, left, right);
                } else if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                } else {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap = (gap/2) + (gap%2);
        }
    }
}



public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int n = nums1.length;
        int m = nums2.length;

        Solution1 obj = new Solution1();
        obj.merge_arrays_optimal2(nums1, nums2, n, m);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
