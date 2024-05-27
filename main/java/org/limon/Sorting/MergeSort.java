package org.limon.Sorting;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        int[] res = mergeSort(nums, nums.length);
        return res;
    }

    private int[] mergeSort(int[] nums, int length) {
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

        sortArray(left);
        sortArray(right);
        merge(nums, left, right, mid, (len-mid));
        return nums;
    }

    private void merge(int[] nums, int[] left, int[] right, int firstHalf, int secondHalf) {
        int i = 0, j = 0, k = 0;
        while (i < firstHalf && j < secondHalf) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while (i < firstHalf) {
            nums[k++] = left[i++];
        }

        while (j < secondHalf) {
            nums[k++] = right[j++];
        }

    }
}

