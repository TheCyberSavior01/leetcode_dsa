package org.limon.Array;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Optimized Solution - O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
                return true;
            } else {
                map.put(num, 1);
            }
        }
//        BruteForce Solution - O(n ** 2)
//        for (int num : nums) {
//            if (map.get(num) > 1) {
//                return true;
//            }
//        }
        return false;
    }
}
