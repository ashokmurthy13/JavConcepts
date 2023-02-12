package com.learn.java.concepts.general;

public class PassByValue {


    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.value = 34;
        changeReference(foo);
        System.out.println(foo.value); // prints 34
    }

    public static Foo changeReference(Foo foo) {
        Foo newFoo = new Foo();
        newFoo.value = 10;
        foo = newFoo;
        return foo;
    }
}

class Foo {
    int value;
}

