package org.limon.Queue;

public class MyStack {
    private int maxSize;
    private int top;
    private int[] array;
    private int currentSize;


    public MyStack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.currentSize = 0;
        this.array = new int[size];
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int top() {
        if (isEmpty()) return -1;
        return array[top];
    }

    public void push(int value) {
        if (isFull()) System.out.println("overflow");
        array[++top] = value;
        currentSize++;
    }

    public int pop() {
        if (isEmpty()) return -1;
        currentSize--;
        return array[top--];
    }

}
