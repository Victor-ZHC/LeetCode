package com.victor.datastructure;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Victor_Zhou on 2017-5-28.
 */
public class PriorityQueueTest {
    private PriorityQueue priorityQueue;
    private int[] inputArray;

    @Before
    public void setUp() throws Exception {
        priorityQueue = new PriorityQueue();
        inputArray = new int[]{ 2, 4, 5, 1, 3, 5, 7, 6, 8, 9 };
    }

    @Test
    public void testQueue() throws Exception {
        for (int i = 0; i < inputArray.length; i++) {
            priorityQueue.push(inputArray[i]);
        }
        System.out.println("the length of Queue is: " + priorityQueue.size());
        int size = priorityQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(priorityQueue.pop());
        }
        System.out.println("the length of Queue is: " + priorityQueue.size());
    }
}