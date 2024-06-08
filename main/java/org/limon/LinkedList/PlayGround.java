package org.limon.LinkedList;

public class PlayGround {
    public static void main(String[] args) {
        NthNodeFromEnd.ListNode head = new NthNodeFromEnd.ListNode(1);
        head.next = new NthNodeFromEnd.ListNode(2);
        head.next.next = new NthNodeFromEnd.ListNode(3);
        head.next.next.next = new NthNodeFromEnd.ListNode(4);


        // 1, 2, 3, 4
        // len = 4 - 1, n = 2, (4-2+1) = 3
        NthNodeFromEnd nthNodeFromEnd = new NthNodeFromEnd();
        //nthNodeFromEnd.printLinkedList(head);
        System.out.println(nthNodeFromEnd.nthFromEnd(head, 2));
    }
}
