package org.limon.Sorting;

public class QuickSort {
    public int[] quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int j = start;
        int pivot = arr[end];

        // 2, 4, 6, 1, 3
        // 2, 1, 6, 4, 3
        // 2, 1, 3, 4, 6

        for (int i = j; i < end; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        arr[end] = arr[j];
        pivot = arr[j];

        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
        return arr;
    }
}
