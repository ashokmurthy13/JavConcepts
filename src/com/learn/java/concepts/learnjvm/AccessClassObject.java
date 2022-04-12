package com.learn.java.concepts.learnjvm;

import java.util.HashSet;
import java.util.Set;

public class AccessClassObject {

    public static void main(String[] args) throws ClassNotFoundException {

        // 1. Using Object Reference and getObject() method from Object class

        // Example 1
        ClassInitializationDemo demo = new ClassInitializationDemo();
        Class clazz = demo.getClass();
        System.out.println(clazz.getName());

        // Example 2
        Set<String> set = new HashSet<>();
        System.out.println(set.getClass().getName());

        // 2. Using Class.forName

        // Examples
        System.out.println(Class.forName("com.learn.java.concepts.learnjvm.ClassInitializationDemo").getName());
        System.out.println(Class.forName("java.util.HashSet").getName());
        System.out.println(Class.forName("[Ljava.lang.Double;").getName());

        // 3. Using Class Literals : By Appending .class to type name
        // works with classes, interfaces, arrays and primitives
        // String.class boolean.class int[][][].class void.class
    }
}
