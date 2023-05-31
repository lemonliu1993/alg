package com.lemon.modules.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lemoon on 2023/5/31 05:16
 */
public class T1_MyStack {

    private Queue<Integer> queue1 = new LinkedList<Integer>();
    private Queue<Integer> queue2 = new LinkedList<Integer>();

    public T1_MyStack() {

    }

    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
