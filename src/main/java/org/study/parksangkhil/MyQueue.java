package org.study.parksangkhil;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tmpStack = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        tmpStack.addAll(stack);
        stack.removeAllElements();
        stack.push(x);
        stack.addAll(tmpStack);
        tmpStack.removeAllElements();
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
