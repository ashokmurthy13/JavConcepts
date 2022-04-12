package com.learn.java.concepts.methodreferences;

public class InstanceMethodObjectReference {

    public static void main(String[] args) {

        ArithmeticOperation addition = (a, b) -> {
            int sum = a + b;
            System.out.println("Sum: " + sum);
            return sum;
        };
        addition.addition(10, 20);

        InstanceMethodObjectReference instance = new InstanceMethodObjectReference();
        ArithmeticOperation operation = instance::sum;
        operation.addition(10, 20);

    }

    public int sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
