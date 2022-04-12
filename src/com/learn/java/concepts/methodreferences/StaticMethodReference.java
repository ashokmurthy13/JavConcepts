package com.learn.java.concepts.methodreferences;

public class StaticMethodReference {

    public static void main(String[] args) {

        // traditional way
        ArithmeticOperation addition = new ArithmeticOperation() {
            @Override
            public int addition(int a, int b) {
                return a + b;
            }
        };
        addition.addition(10, 20);

        // method reference way
        ArithmeticOperation operation = StaticMethodReference::performAdditions;
        operation.addition(10, 20);

    }

    public static int performAdditions(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
