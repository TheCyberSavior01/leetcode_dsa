package org.limon.LinkedList;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int len = 0;

        while (curr != null) {
            len++;
            curr = curr.next;
        }

        if (len == 1) return head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
