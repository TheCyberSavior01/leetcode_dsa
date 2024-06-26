package org.limon.playground;

public class mergeSortImpl {
    public int[] mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;

        int len = arr.length;
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int j = mid; j < len; j++) {
            right[j-mid] = arr[j];
        }
        mergeSort(left);
        mergeSort(right);
        return merge(arr,left, right);
    }

    private int[] merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k] = left[j];
            i++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
        }

        return arr;
    }
}
