package com.example.demo;

import com.example.demo.algorithm.MyLink;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Objects;


@Slf4j
public class IfTest01 {
    // 定义一个头结点
    Node head = null;

    // 定义一个链表
    class Node{
        // 节点的引用，指向下一个节点
        Node next = null;
        // 节点里的信息
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    // 链表添加方法
    public void add(int p){
        Node newNode = new Node(p);
        // 当头结点为空的时候
        if (Objects.isNull(head)){
            head = newNode;
            return;
        }
        // 当头结点不为空
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    // 链表的删除方法
    public boolean remove(int index){
        if (index < 1 || index > length()){
            return false;
        }
        if (index == 1){
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = head.next;
        while (curNode != null){
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    /**
     *
     * @return 返回节点长度
     */
    public int length() {
        int length = 0;
        IfTest01.Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }





    public static void main(String[] args) {
    }
}
