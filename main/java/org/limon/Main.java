package org.limon;

import org.limon.Array.ConcatOfArray;
import org.limon.Array.RemoveDuplicates;
import org.limon.Array.RemoveElement;

public class Main {
    public static void main(String[] args) {
        ConcatOfArray concatOfArray = new ConcatOfArray();
        int[] arr1 = new int[] {1,2,1};
        int[] arr2 = new int[] {1,3,2,1};
        int [] res = concatOfArray.getConcatenation(arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}