package com.example.demo.test20210321;

public class Node {
    private final int value;
    private Node node;


    public Node(int value) {
        this.value = value;
        this.node = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
