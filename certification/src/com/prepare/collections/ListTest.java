package com.prepare.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String str = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(str);
        list.add(new String("Hello"));
        list.add(str);
        str.replace("l", "L");
        System.out.println(list);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(1);

        listInt.remove(1);

        listInt.removeIf(number -> number == 1); // doesn't throw any exception
        System.out.println(listInt);

        for (Integer i : listInt) {
            if (i == 3) {
                listInt.remove(i); // throws ConcurrentModificationException
            }
        }
        System.out.println(listInt);
    }
}
