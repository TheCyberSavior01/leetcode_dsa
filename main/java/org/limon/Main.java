package org.limon;

import org.limon.LinkedList.BrowserHistory;
import org.limon.LinkedList.DesignLinkedList;
import org.limon.LinkedList.MergeTwoSotredLinkedList;
import org.limon.Queue.ImplementStackUsingTwoQueues;
import org.limon.Queue.StudentsUnableToEatLunch;
import org.limon.Sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{5,2,3,1};
        InsertionSort insertionSort = new InsertionSort();
        int[] ints = insertionSort.sortArray(nums);
        for(int i : ints) {
            System.out.println(i);
        }
    }

}