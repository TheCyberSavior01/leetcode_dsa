package org.limon.Queue;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public int peek() {
        return stack1.peek();
    }

    public void enQueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack2.push(value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) return -1;
        return stack1.pop();
    }
}


