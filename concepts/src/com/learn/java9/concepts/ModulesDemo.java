package com.learn.java9.concepts;

import com.learn.java9.concepts.youtube.HelloYoutube;
import com.learn.java9.hello.HelloWorld;

public class ModulesDemo {

    public static void main(String[] args) {
        HelloYoutube helloYoutube = new HelloYoutube();
        helloYoutube.print();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
    }
}
