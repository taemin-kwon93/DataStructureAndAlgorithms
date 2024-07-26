package org.study.parksangkhil;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);

        for (int i = 1; i < queue.size(); i++) {
            System.out.println("test: " + x);
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        if (queue.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
