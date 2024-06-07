package org.limon.LinkedList;

public class RemoveDuplicates {
    private class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode (int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode outer = head;

        // 1 -> 2 -> 3 -> 4 -> 4

        while (outer != null ) {
            ListNode inner = outer;
            while (inner != null && inner.next != null) {
                if (inner.val == inner.next.val) {
                   inner.next = inner.next.next;
                } else {
                    inner = inner.next;
                }
            }
            outer = outer.next;
        }

        return head;
    }
}
