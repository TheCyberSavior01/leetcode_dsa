package org.limon.Queue;

import java.util.NoSuchElementException;

public class BasicQueue {
    private Node head;
    private Node tail;
    private int size;

    public static class Node{
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public BasicQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int value) {
        if (size == 0) {
            head = new Node(value, null);
            tail = head;
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {

        }
    }

}
