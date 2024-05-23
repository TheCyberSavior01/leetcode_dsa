package org.limon.LinkedList;

public class BrowserHistory {
    public ListNode head;
    ListNode tail;
    ListNode current;
    public int length;

    public BrowserHistory(String homepage) {
        this.head = new ListNode(homepage);
        this.tail = head;
        this.current = head;
        this.length = 1;
    }

    // 1 -> 2 -> 3 -> 4 -> null
    //     curr

    public void visit(String url) {
        ListNode newNode = new ListNode(url);

        // If there are nodes after current, discard them
        if (current.next != null) {
            current.next.prev = null;
        }

        current.next = newNode;
        newNode.prev = current;
        current = newNode;
        tail = newNode; // update the tail to the new node
        length++;
    }

    public String back(int steps) {
        while (steps > 0 && current.prev != null) {
            current = current.prev;
            steps--;
        }
        return current.homepage;
    }

    public String forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
        return current.homepage;
    }

    public static class ListNode {
        public String homepage;
        public ListNode next;
        ListNode prev;

        public ListNode(String homepage) {
            this.homepage = homepage;
        }
    }

}
