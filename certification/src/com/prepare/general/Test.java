package com.prepare.general;

public class Test {

    public static void main(String[] args) {
        T t = new T();
        System.out.println(t.t);
    }
}

class T {
    int t = 20;

    T() {
        t = 40;
    }
}
