package org.limon;


import org.limon.Sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1, 5, 3, 6};
        MergeSort mergeSort = new MergeSort();
        int[] output = mergeSort.sortArray(nums);
        for (int i: output) {
            System.out.println(i);
        }
    }

}