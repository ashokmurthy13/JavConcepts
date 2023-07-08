package com.prepare.interfaces;

public interface VariableInterface {
    int a = 10;
}


class Test implements VariableInterface {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
    }
}