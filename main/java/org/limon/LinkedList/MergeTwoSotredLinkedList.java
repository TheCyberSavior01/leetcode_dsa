package org.limon.LinkedList;

public class MergeTwoSotredLinkedList {
    public class ListNode {
        public int val;
        public org.limon.LinkedList.ListNode next;

        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, org.limon.LinkedList.ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode tail = newNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return newNode.next;

    }


}
