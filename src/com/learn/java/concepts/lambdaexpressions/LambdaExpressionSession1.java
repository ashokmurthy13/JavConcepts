package com.learn.java.concepts.lambdaexpressions;

public class LambdaExpressionSession1 {

    public static void main(String[] args) {
        methodWithNoParams();
        methodWithOneParam();
        methodWithNParams();
        returnWithParams();
    }

    private static void methodWithNoParams() {
        Runnable runnableTraditional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Traditional Way: " + Thread.currentThread().getName());
            }
        };
        new Thread(runnableTraditional).start();

        Runnable runnable = () -> System.out.println("Lambda Way: " + Thread.currentThread().getName());
        new Thread(runnable).start();

        new Thread(() -> System.out.println("Simplified Lambda Way: " + Thread.currentThread().getName())).start();
    }

    private static void methodWithOneParam() {

        FunctionalInterfaceDemo demo1 = new FunctionalInterfaceDemo() {
            @Override
            public void print(String name) {
                System.out.println("Traditional way: " + name);
            }
        };
        demo1.print("Ashok");

        FunctionalInterfaceDemo demo = name -> System.out.println("Lambda Way: " + name);
        demo.print("Ashok");
    }

    private static void methodWithNParams() {

        FunctionalInterfaceDemo2 demo = new FunctionalInterfaceDemo2() {
            @Override
            public void calculate(int a, int b) {
                System.out.println("Traditional Way. Sum: " + (a + b));
            }
        };
        demo.calculate(10, 20);

        FunctionalInterfaceDemo2 demo2 = (a, b) -> System.out.println("Lambda Way. Sum: " + (a + b));
        demo2.calculate(10, 20);

        FunctionalInterfaceDemo3 demo3 = new FunctionalInterfaceDemo3() {
            @Override
            public void calculate(int a, int b, int c, int d) {
                System.out.println("Traditional Way. Sum: " + (a + b + c + d));
            }
        };
        demo3.calculate(10, 20, 30, 40);

        FunctionalInterfaceDemo3 demo31 = (a, b, c, d) -> System.out.println("Lambda Way. Sum: " + (a + b + c + d));
        demo31.calculate(10, 20, 30, 40);
    }

    private static void returnWithParams() {

        FunctionalInterfaceDemo4 demo = new FunctionalInterfaceDemo4() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(demo.calculate(10, 20));

        FunctionalInterfaceDemo4 demo1 = (a, b) -> a + b;
        System.out.println(demo1.calculate(10, 20));

        // using method reference
        FunctionalInterfaceDemo4 demo2 = Integer::sum;
        demo2.calculate(10, 20);

        // With return statement
        FunctionalInterfaceDemo4 fi = (a, b) -> {
            int c = a + b;
            return c;
        };
        int result = fi.calculate(10, 20);
        System.out.println(result);
    }

}
