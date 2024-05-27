package org.limon.Sorting;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        if (len < 2) return nums;
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }

        for (int j = mid; j < len; j++) {
            right[j - mid] = nums[j];
        }

    }
}

public int[] mergeSort(int[] array,  int length) {

}