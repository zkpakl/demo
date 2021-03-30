package com.example.demo.algorithm_test.test20210329;

import java.util.Stack;


/**
 *用两个栈来实现一个队列，完成队列的Push和Pop操作。
 *队列中的元素为int类型
 */
public class Solution02 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        // 往第一个栈顶添加元素
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                // 将第一个栈的元素移除并放入到第二个栈当中
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
