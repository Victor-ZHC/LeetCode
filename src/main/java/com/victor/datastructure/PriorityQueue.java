package com.victor.datastructure;

/**
 * Created by Victor_Zhou on 2017-5-28.
 */
public class PriorityQueue {
    private int size;
    private int[] queue;

    PriorityQueue() {
        this.size = 0;
        this.queue = new int[7];
    }

    private void upFloat() {
        int index = this.size();
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (this.queue[index] > this.queue[parent]) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void downFloat() {
        int index = 0;
        while (index * 2 + 1 < this.size()) {
            int child = 2 * index + 1;
            if (child + 1 < this.size() && this.queue[child] > this.queue[child + 1]) {
                child += 1;
            }
            if (this.queue[index] < this.queue[child]) {
                break;
            }
            swap(index, child);
            index = child;
        }
    }

    private void swap(int i, int j) {
        int temp = this.queue[i];
        this.queue[i] = this.queue[j];
        this.queue[j] = temp;
    }

    public boolean isEmpty() {
        return this.size() == 0 ? true : false;
    }

    public int size() {
        return this.size;
    }

    public void push(int element) {
        this.queue[this.size()] = element;
        upFloat();
        this.size += 1;

        if (this.size() == this.queue.length) {
            int[] newQueue = new int[this.queue.length * 2 + 1];
            for (int i = 0; i < this.queue.length; i++) {
                newQueue[i] = this.queue[i];
            }
            this.queue = newQueue;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("this Queue is empty!");
            throw new NullPointerException();
        }

        int temp = this.queue[0];
        this.queue[0] = this.queue[this.size() - 1];
        downFloat();
        this.size -= 1;

        return temp;
    }
}
