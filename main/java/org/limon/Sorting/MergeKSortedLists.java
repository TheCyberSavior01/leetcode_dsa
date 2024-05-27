package org.limon.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLists {
    public static class ListNode {
          public int val;
          public ListNode next;
          public ListNode() {}
        ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        while (lists.length > 1) {
            List<ListNode> newList = new ArrayList<>();
            for (int i = 0; i < lists.length; i+=2) {
                ListNode l1 = lists[i];
                ListNode l2 = (i+1 < lists.length) ? lists[i+1] : null;
                newList.add(mergeTwoLists(l1, l2));
            }
            lists = newList.toArray(new ListNode[newList.size()]);
        }
        return lists[0];
    }

    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode Node = new ListNode();
        ListNode tail = Node;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }
        return Node.next;
    }
}

