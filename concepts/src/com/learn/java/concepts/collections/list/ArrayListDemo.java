package com.learn.java.concepts.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        List<String> nameList = new ArrayList<>();
        nameList.add("Tokyo");
        nameList.add("Amsterdam");
        nameList.add("Austin");
        nameList.add("Berlin");

        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.startsWith("T")) {
                iterator.remove();
                //nameList.remove(city);
            }
        }
        System.out.println(nameList);
    }
}
