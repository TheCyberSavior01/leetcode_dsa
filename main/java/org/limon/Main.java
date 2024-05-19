package org.limon;

import org.limon.Array.RemoveDuplicates;
import org.limon.Array.RemoveElement;

public class Main {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}