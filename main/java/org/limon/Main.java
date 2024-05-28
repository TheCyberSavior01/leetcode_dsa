package org.limon;


import org.limon.Sorting.MergeKSortedLists;
import org.limon.Sorting.MergeKSortedLists.ListNode;
import org.limon.Sorting.MergeSort;
import org.limon.Sorting.QuickSort;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[] {2, 3, 6, 4, 3, 2};
        int[] res = quickSort.quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}