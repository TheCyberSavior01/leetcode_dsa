package org.limon;

import org.limon.Array.IsUnique;

public class Main {
    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isUnique.isUnique(arr));
    }
}