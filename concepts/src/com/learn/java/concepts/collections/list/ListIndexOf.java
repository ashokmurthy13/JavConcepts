package com.learn.java.concepts.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListIndexOf {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(0));

        //list.remove(list.indexOf(0));
        list.remove(Integer.valueOf(1));

        System.out.println(list);
    }
}
