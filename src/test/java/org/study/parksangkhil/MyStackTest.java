package org.study.parksangkhil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack stack;

    @BeforeEach
    void setUp() {
        stack = new MyStack();
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertFalse(stack.empty());
        assertEquals(3, stack.top()); // The last pushed element should be on top
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop()); // The last pushed element should be popped first
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }

    @Test
    void top() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.top()); // The last pushed element should be on top
        stack.pop(); // Remove the top element
        assertEquals(2, stack.top()); // Now the next element should be on top
    }

    @Test
    void empty() {
        assertTrue(stack.empty());
        stack.push(1);
        assertFalse(stack.empty());
        stack.pop();
        assertTrue(stack.empty());
    }
}