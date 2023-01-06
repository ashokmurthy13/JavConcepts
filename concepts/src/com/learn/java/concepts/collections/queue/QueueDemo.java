package com.learn.java.concepts.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        //Using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue Elements: " + queue);
        System.out.println("Removed from Head: " +queue.remove());
        System.out.println("Queue After Removed Elements : " + queue);
        queue.add(4);
        System.out.println("Queue Elements : " + queue);
        System.out.println("Head Queue Elements : " + queue.poll());
        System.out.println("Queue Elements : " + queue);

        // Using PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        System.out.println("PriorityQueue: " + priorityQueue);
        priorityQueue.add(4);
        priorityQueue.add(5);
        System.out.println("PriorityQueue: " + priorityQueue);
        int removed = priorityQueue.remove();
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Removed Element: " + removed);
        int poll = priorityQueue.poll();
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Polled Element: " + poll);

    }
}
