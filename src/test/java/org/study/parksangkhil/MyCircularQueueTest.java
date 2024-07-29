package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCircularQueueTest {

    private MyCircularQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new MyCircularQueue(3); // 큐의 크기를 3으로 설정
    }

    @Test
    public void testEnQueue() {
        assertTrue(queue.enQueue(1)); // 성공적으로 삽입
        assertTrue(queue.enQueue(2));
        assertTrue(queue.enQueue(3));
        assertFalse(queue.enQueue(4)); // 큐가 가득 찼으므로 실패
    }

    @Test
    public void testDeQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertTrue(queue.deQueue()); // 성공적으로 제거
        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertFalse(queue.deQueue()); // 큐가 비었으므로 실패
    }

    @Test
    public void testFront() {
        assertEquals(-1, queue.Front()); // 큐가 비어 있음

        queue.enQueue(1);
        assertEquals(1, queue.Front());

        queue.enQueue(2);
        assertEquals(1, queue.Front());

        queue.deQueue();
        assertEquals(2, queue.Front());
    }

    @Test
    public void testRear() {
        assertEquals(-1, queue.Rear()); // 큐가 비어 있음

        queue.enQueue(1);
        assertEquals(1, queue.Rear());

        queue.enQueue(2);
        assertEquals(2, queue.Rear());

        queue.enQueue(3);
        assertEquals(3, queue.Rear());

        queue.deQueue();
        assertEquals(3, queue.Rear());
    }

    @Test
    public void testIsFull() {
        assertFalse(queue.isFull());

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        assertTrue(queue.isFull());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());

        queue.enQueue(1);
        assertFalse(queue.isEmpty());

        queue.deQueue();
        assertTrue(queue.isEmpty());
    }
}