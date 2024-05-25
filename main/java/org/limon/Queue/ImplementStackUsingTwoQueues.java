package org.limon.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingTwoQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public ImplementStackUsingTwoQueues() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public void printStack() {
        for(int val : q1) {
            System.out.println(val);
        }
    }
}
