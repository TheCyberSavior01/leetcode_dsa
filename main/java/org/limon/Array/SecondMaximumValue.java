package org.limon.Array;

public class SecondMaximumValue {
    public int secondMaximumValue(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else {
                min = nums[i];
            }
        }

        int distance = max - min;
        int secondMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max - nums[i] < distance && nums[i] != max) {
                distance = max - nums[i];
                secondMax = nums[i];
            }
        }

        return secondMax;

    }
}
