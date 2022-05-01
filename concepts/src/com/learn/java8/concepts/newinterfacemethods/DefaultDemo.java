package com.learn.java8.concepts.newinterfacemethods;

public class DefaultDemo implements DefaultInterfaceMethodDemo, DefaultInterfaceMethodTwo {

    public static void main(String[] args) {
        DefaultDemo demo = new DefaultDemo();
        demo.print();
    }

    // Diamond Problem. Ambiguity to the compiler and it will throw an error
    @Override
    public void print() {
        DefaultInterfaceMethodDemo.super.print(); // OR
        DefaultInterfaceMethodTwo.super.print(); // Custom implementation as below
    }

//    // don't use "default" keyword, it's only in interface
//    public void print() {
//        System.out.println("Overridden inside implementation class");
//    }
}
