package org.limon.LinkedList;

public class NthNodeFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Two pointer (fast and slow pointers)
    public ListNode nthFromEndTP(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            int i = 0;
            fast = fast.next;
        }
        return slow;
    }

    public ListNode nthFromEnd(ListNode head, int n) {
        int len = findLength(head) - 1;
        ListNode curr = head;
        int i = 0;

        while (i < (len - n + 1)) {
            curr = curr.next;
            i++;
        }

        return curr;
    }

    public int findLength(ListNode head) {
        int len = 0;

        while (head != null) {
            head = head.next;
            len++;
        }

        return len;
    }

    public void printLinkedList (ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


}
