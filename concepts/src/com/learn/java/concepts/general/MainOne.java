package com.learn.java.concepts.general;

class A{
    private class B{} // cannot be accessed outside of class A
}

public class MainOne {
    public static void main(String[] args) {
       // B b = new B();
    }
}
