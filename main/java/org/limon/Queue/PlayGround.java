package org.limon.Queue;

public class PlayGround {
    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enQueue(1);
        queueUsingStack.enQueue(2);
        queueUsingStack.enQueue(3);

        queueUsingStack.enQueue(4);
        queueUsingStack.dequeue();
        queueUsingStack.dequeue();
        System.out.println("peek: "  + queueUsingStack.peek());
    }
}
