package org.limon.Array;

public class ConcatOfArray {
    public int[] getConcatenation(int[] nums) {
        int idx = 0;
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[idx] = nums[i];
            ans[idx + nums.length] = nums[i];
            idx++;
        }
        return ans;
    }
}
