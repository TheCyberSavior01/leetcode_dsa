package org.limon.Array;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (map.containsKey(y)) {
                result[0] = i;
                result[1] = map.get(y);
            }else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
