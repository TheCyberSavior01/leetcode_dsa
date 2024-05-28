package org.limon.Sorting;

public class QuickSort {
    public int[] quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int j = start;
        int pivot = arr[end];

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
