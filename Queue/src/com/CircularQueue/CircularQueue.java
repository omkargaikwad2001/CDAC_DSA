package com.CircularQueue;

public class CircularQueue {

    private int size;
    private int[] que;
    private int front, rear;

    public CircularQueue() {
        size = 0;
        que = null;
        front = rear = -1;
    }

    public void initQueue(int size) {
        this.size = size;
        que = new int[this.size];
        front = rear = -1;
    }

    public boolean isFull() {
        if (front == (rear + 1) % size) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }


    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("\tQUEUE OVERFLOW...!!!");
            return;
        }

        if (front == -1) // first element
            front = 0;

        rear = (rear + 1) % size;
        que[rear] = value;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("\tQUEUE UNDERFLOW...!!!");
            return -1;
        }

        int value = que[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("\tQUEUE is empty...!!!");
            return;
        }

        int i = front;
        System.out.print("\t");
        while (true) {
            System.out.print(que[i] + "\t");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
