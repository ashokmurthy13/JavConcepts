package com.learn.java.concepts.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapString {

    public MapString(String val) {
        this.val = val;
    }

    private String val;

    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        String str1 = new String("Java OOPs!");
        String str2 = new String("Java OOPs");
        map1.put(str1, new Integer(10));
        map1.put(str2, new Integer(20));

        Map<MapString,Integer> map2 = new HashMap<>();
        MapString str3 = new MapString(str1);
        MapString str4 = new MapString(str2);
        map2.put(str3, new Integer(10));
        map2.put(str4, new Integer(20));

        System.out.println(map2.get(str2));
        System.out.println(map2.get(str4));
    }
}
