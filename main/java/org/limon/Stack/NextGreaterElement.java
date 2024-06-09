package org.limon.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[j] > nums[i]) {
                nums[i] = nums[j];
                i++;
            } else {
                j++;
            }
        }

        return nums;
    }
}
