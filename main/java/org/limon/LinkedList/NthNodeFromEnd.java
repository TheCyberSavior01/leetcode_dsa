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
