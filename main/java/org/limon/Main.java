package org.limon;


import org.limon.Sorting.MergeKSortedLists;
import org.limon.Sorting.MergeKSortedLists.ListNode;
import org.limon.Sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(5, new ListNode(3, new ListNode(18, null)));
        ListNode node2 = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3, null))));
        ListNode[] nodeArr = new ListNode[]{node1, node2};
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode output = mergeKSortedLists.mergeKLists(nodeArr);
        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }
    }

}