package org.limon.LinkedList;

public class PalindromeDoublyLinkedList {
    public class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode prev;
        public DoublyLinkedListNode next;

        public DoublyLinkedListNode(int data, DoublyLinkedListNode prev, DoublyLinkedListNode next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public DoublyLinkedListNode(int data) {
            this(data, null, null);
        }
    }

    public static boolean isPalindrome(DoublyLinkedListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;

        DoublyLinkedListNode tail = head;
        int tailCounter = 0;

        while (tail.next != null) {
            tail = tail.next;
            tailCounter++;
        }

        DoublyLinkedListNode curr = head;
        int currCounter = 0;

        while (currCounter <= tailCounter) {
            if (curr.data != tail.data) {
                return false;
            }
            curr = curr.next;
            tail = tail.prev;
            currCounter++;
            tailCounter--;
        }


        // Replace this placeholder return statement with your code
        return true;
    }
}