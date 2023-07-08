package com.learn.java.concepts.general;

interface hack1{
    String p = "lets code";
    String methodP();
}

interface hack2{
    String q = "lets party";
    String methodQ();
}

class hack3 implements hack1, hack2 {

    @Override
    public String methodP() {
        return q+p;
    }

    @Override
    public String methodQ() {
        return p+q;
    }
}

public class MainClass {
    public static void main(String[] args) {
        hack3 r = new hack3();
        System.out.println(r.methodP());
        System.out.println(r.methodQ());
    }
}
