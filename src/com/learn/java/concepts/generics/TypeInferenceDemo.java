package com.learn.java.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceDemo {

    static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = add(new ArrayList<>(), 20, 40);
        System.out.println(list1);

        List<String> list2 = add(new ArrayList<>(), "ashok", "poorani");
        System.out.println(list2);

    }
}
