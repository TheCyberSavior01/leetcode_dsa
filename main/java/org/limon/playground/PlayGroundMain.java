package org.limon.playground;

public class PlayGroundMain {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 1, 6, 2, 7, 3, 9};

        mergeSortImpl mergeSortImpl = new mergeSortImpl();
        int[] result = mergeSortImpl.mergeSort(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
