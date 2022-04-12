package com.learn.java.concepts.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        arrayListDemo();
        linkedListDemo();
    }

    private static void arrayListDemo() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 1; i <= 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList add operation: total time to add 1M elements : " + ((endTime - startTime) / 1e+6) + " ms");
    }

    private static void linkedListDemo() {
        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList size: " + linkedList.size());
        System.out.println("LinkedList add operation: total time to add 1M elements : " + ((endTime - startTime) / 1e+6) + " ms");
    }
}
