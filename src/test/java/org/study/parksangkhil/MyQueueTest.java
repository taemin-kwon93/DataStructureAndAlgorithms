package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    private MyQueue queue;

    @BeforeEach
    void setUp() {
        queue = new MyQueue();
    }

    @Test
    void push() {
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertFalse(queue.empty());
        assertEquals(1, queue.peek());
    }

    @Test
    void pop() {
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertTrue(queue.empty());
    }

    @Test
    void peek() {
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(1, queue.peek()); // Peek the front element
        queue.pop(); // Remove the front element
        assertEquals(2, queue.peek()); // Now the front element should be 2
    }

    @Test
    void empty() {
        assertTrue(queue.empty());
        queue.push(1);
        assertFalse(queue.empty());
        queue.pop();
        assertTrue(queue.empty());
    }
}