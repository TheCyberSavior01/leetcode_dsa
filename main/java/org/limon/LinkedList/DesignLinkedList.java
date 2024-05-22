package org.limon.LinkedList;

public class DesignLinkedList {
    ListNode head;
    ListNode tail;
    public int length = 0;
    public DesignLinkedList() {
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        } else if (index == 0) {
            return head.val;
        } else if (index == length - 1) {
            return tail.val;
        } else{
            int i = 0;
            int value = 0;
            ListNode pointer = head;
            while ( i <= index ) {
                value = pointer.val;
                i++;
                pointer = pointer.next;
            }
            return value;
        }
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (length == 0) {
           head = newNode;
           tail = head;
            length += 1;
        }else {
            newNode.next = head;
            head.prev = newNode;

            head = newNode;
            length += 1;
        }
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if(length == 0) {
            head = newNode;
            tail = head;
            length += 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
            length++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
          addAtHead(val);
        } else if(index == length) {
            addAtTail(val);
        } else if (index > length - 1) {
            System.out.println("invalid index");
        } else {
            ListNode newNode = new ListNode(val);
            ListNode curr = head;
            int i = 0;
            while (i <= index) {
                if (i == index) {
                    ListNode temp = curr.prev;
                    temp.next = newNode;
                    newNode.prev = temp;
                    newNode.next = curr;
                    curr.prev = newNode;
                    length += 1;
                }
                i++;
                curr = curr.next;
            }
        }
    }

    // 1 -> 2 -> 3 -> 4 -> null

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (length == 1) {
                head = null;
            } else {
                ListNode temp = head.next;
                head = temp;
                head.next = null;
                length -= 1;
            }
        } else if (index == length - 1) {
            ListNode temp = tail.prev;
            tail.prev = null;
            temp.next = null;
            tail = temp;
            length -= 1;
        } else if(index > length - 1) {
            System.out.println("invalid index");
        } else  {
            ListNode curr = head;
            int i = 0;
            while (i <= index) {
                if (i == index) {
                    ListNode nxt = curr.next;
                    ListNode bck = curr.prev;
                    bck.next = nxt;
                    nxt.prev = bck;
                    length -= 1;
                }
                i++;
                curr = curr.next;
            }
        }
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode (int val) {
            this.val = val;
        }
    }
}
