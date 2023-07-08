package com.learn.java.concepts.generics;

public class BeforeGenerics {

    public static void main(String args[]) {
        Sample s1 = new Sample();
        s1.setData(1);
        System.out.println(s1.getData());

        Sample s2 = new Sample();
        s2.setData(1.2);
        System.out.println(s2.getData());

        Sample s3 = new Sample();
        s3.setData("Generics");
        System.out.println(s3.getData());

        Sample s4 = new Sample();
        s4.setData("test");
        // compiler will not throw any exception, since the actual value is not known at compile time.
        // runtime will throw ClassCastException, since String cannot be cast to Integer. this is the problem with the Object class approach
        // todo : how to check this at compile time - Generics - AfterGenerics.java
        Integer intData = (Integer) s4.getData();
        System.out.println(intData);
    }
}

class Sample {
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
