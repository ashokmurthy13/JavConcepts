package com.learn.java.concepts.oops.inheritance;

class Parent {
    public String msg = "22";
}

class Child extends Parent {
    private int msg = 22;
}


public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.msg += 2);
    }
}