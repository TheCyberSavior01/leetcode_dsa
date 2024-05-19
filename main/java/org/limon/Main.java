package org.limon;

import org.limon.Array.ConcatOfArray;
import org.limon.Array.ContainsDuplicate;
import org.limon.Array.RemoveDuplicates;
import org.limon.Array.RemoveElement;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] arr1 = new int[] {1, 2, 3, 4, 0};
        System.out.println(containsDuplicate.containsDuplicate(arr1));

    }
}