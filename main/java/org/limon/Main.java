package org.limon;

import org.limon.Array.EvenComesFirst;
import org.limon.LinkedList.BrowserHistory;
import org.limon.LinkedList.DesignLinkedList;
import org.limon.LinkedList.MergeTwoSotredLinkedList;
import org.limon.Queue.ImplementStackUsingTwoQueues;
import org.limon.Queue.StudentsUnableToEatLunch;
import org.limon.Sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        EvenComesFirst evenComesFirst = new EvenComesFirst();
        int[] res = evenComesFirst.evenComesFirst(nums);
        for(int i: res) {
            System.out.println(i);
        }
    }

}