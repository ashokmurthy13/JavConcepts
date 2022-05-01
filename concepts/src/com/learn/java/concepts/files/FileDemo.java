package com.learn.java.concepts.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/ashokmurthy/casestudy.txt");

        // 1. Using BufferedReader
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String st;
        while ((st = bf.readLine()) != null) {
            System.out.println(st);
        }

        System.out.println("========================");

        // 2. Using FileReader
        FileReader reader = new FileReader(file);
        int idx;
        while ((idx = reader.read()) != -1) {
            System.out.print((char) idx);
        }

        System.out.println("========================");

        // 3. Using Scanner
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        System.out.println("========================");

        // 4. Read entire file as String
        String data = new String(Files.readAllBytes(Paths.get(file.toString())));
        System.out.println(data);
    }
}
