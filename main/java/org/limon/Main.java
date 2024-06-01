package org.limon;


import org.limon.Array.SecondMaximumValue;
import org.limon.Searching.BinarySearch;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 6, 6, 11, 13, 1};
        SecondMaximumValue secondMaximumValue = new SecondMaximumValue();
        int res = secondMaximumValue.secondMaximumValue(arr);
        System.out.println(res);

    }

}