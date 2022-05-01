package com.learn.java10.concepts;

import java.util.HashMap;
import java.util.List;

public class LocalVariableTypeReference {

    public static void main(String[] args) {
        var name = "ashok";
        var age = 34;
        var list = List.of(2012, 2013, 2014, 2015);
        //<Serializable & Comparable<? extends Serializable & Comparable<?> & Constable & ConstantDesc> & Constable & ConstantDesc
        var mixList = List.of(2012, 99.99f, "ashok", 56.9);
        var map = new HashMap<>();

        map.put(10, 10);
        map.put(11L, 10.00);
        map.put("ashok", 10);
        map.put("murthy", "ashok");

        System.out.println(name + " " + age);
        System.out.println(list);
        System.out.println(mixList);
        System.out.println(map);

        System.out.println(list.getClass());
        System.out.println(mixList.getClass());
    }
}
