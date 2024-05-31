package org.limon;


import org.limon.Searching.BinarySearch;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = new int[] {2, 3, 6, 6, 11, 13};
        int res = binarySearch.binarySearch(arr, 14);
        System.out.println(res);

    }

}