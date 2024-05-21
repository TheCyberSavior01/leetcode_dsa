package org.limon.Array;

public class IsUnique {
    public boolean isUnique(int[] arr) {
        // Brute Force Solution
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
