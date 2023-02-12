package com.learn.java.concepts.general;

public class Test1 {

    public static void main(String[] args) {
        double d = 1000000;
        String model = null;
        if (d > 100000) {
            model = "Tesla X";
        } else if (d <= 100000) {
            model = "Telsa S";
        }
        System.out.println(model);
    }
}
