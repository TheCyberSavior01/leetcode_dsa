package org.limon.playground;

public class PlayGroundMain {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 1, 6, 2, 7, 3, 9};

        QuickSortImpl quickSort = new QuickSortImpl();
        int[] res = quickSort.quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
