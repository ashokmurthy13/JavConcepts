package com.learn.java.concepts.generics;

public class GenericMethod {

    public <T> void showItem(T item) {
        System.out.println("The item is: " + item.toString());
    }

    public <T> T getItem(T item) {
        System.out.println("The item is: " + item.toString());
        return item;
    }

    public <T, V> void printItems(T t, V v) {
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    public <T> void showItems(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.showItem("Hello World");
        method.showItem('a');
        System.out.println("the item returned is: " + method.getItem(34));
        System.out.println("the item returned is: " + method.getItem("Hello World"));

        method.printItems("My age is: ", 34);

        Integer[] num = {1,2,3,4,5};
        String[] names = {"Ashok", "Saravanan"};
        method.showItems(num);
        method.showItems(names);
    }
}
