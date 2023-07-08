package com.prepare.general;

public class PassByValue {
    public static void main(String[] args) {
        Node node = new Node(213);
        System.out.println(node.num);

        Node n = first(node);
        System.out.println(n.num);

        second(node);
        System.out.println(node.num);
    }

    static Node first(Node n) {
        n = new Node(214);
        return n;
    }

    static void second(Node n) {
        n.num = 214;
    }
}

class Node {
    Integer num;

    Node(Integer num) {
        this.num = num;
    }
}
