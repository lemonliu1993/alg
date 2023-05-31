package com.lemon.modules.queuestack;

import java.util.Stack;

/**
 * Created by lemoon on 2023/6/1 06:11
 */
public class T3_Min_Stack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();


    public T3_Min_Stack() {

    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(val > minStack.peek() ? minStack.peek() : val);
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
