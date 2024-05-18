package org.limon;

import org.limon.Array.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //int[] nums = new int{0,0,1,1,1,2,2,3,3,4}
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        //removeDuplicates.removeDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}