package org.limon.Array;

public class EvenComesFirst {
    public int[] evenComesFirst(int[] arr) {
        // 1, 2, 3, 4, 5, 6
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
}
