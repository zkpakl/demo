package com.example.demo.algorithm.test;

public class TreeNode<E extends Comparable<E>> {
    E val;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) {
        val = e;
    }
}
