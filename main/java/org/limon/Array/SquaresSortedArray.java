package org.limon.Array;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];

            if (leftSqr > rightSqr) {
                res[k] = leftSqr;
                left++;
            } else {
                res[k] = rightSqr;
                right--;
            }
            k--;
        }

        return res;
    }
}
