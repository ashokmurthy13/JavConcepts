package com.learn.java.concepts.general;

abstract class HackerEarth {
    abstract void learn();
}

class code extends HackerEarth {

    public void learn() {
        System.out.println("Hackster codes");
    }
}

class test extends HackerEarth{
    public void learn() {
        System.out.println("Hackster gives test");
    }
}

public class MainMain {

    public static void main(String[] args) {
        test m1 = new test();
        code c1 = new code();
        c1.learn();
        m1.learn();
    }
}
