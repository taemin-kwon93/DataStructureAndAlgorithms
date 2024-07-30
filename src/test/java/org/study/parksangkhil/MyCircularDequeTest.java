package org.study.parksangkhil;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCircularDequeTest {

    @Test
    public void testMyCircularDeque() {
        MyCircularDeque deque = new MyCircularDeque(3); // 크기 3의 deque 생성

        // 초기 상태: 비어있음
        assertTrue(deque.isEmpty());
        assertFalse(deque.isFull());
        assertEquals(-1, deque.getFront());
        assertEquals(-1, deque.getRear());

        // insertLast 테스트
        assertTrue(deque.insertLast(1));
        assertEquals(1, deque.getRear());
        assertFalse(deque.isEmpty());
        assertFalse(deque.isFull());

        // insertLast 테스트
        assertTrue(deque.insertLast(2));
        assertEquals(2, deque.getRear());

        // insertFront 테스트
        assertTrue(deque.insertFront(3));
        assertEquals(3, deque.getFront());

        // 덱이 가득 찼는지 확인
        assertTrue(deque.isFull());

        // insertFront 실패 테스트 (덱이 가득 참)
        assertFalse(deque.insertFront(4));

        // insertLast 실패 테스트 (덱이 가득 참)
        assertFalse(deque.insertLast(5));

        // getFront와 getRear 테스트
        assertEquals(3, deque.getFront());
        assertEquals(2, deque.getRear());

        // deleteFront 테스트
        assertTrue(deque.deleteFront());
        assertEquals(1, deque.getFront());

        // deleteLast 테스트
        assertTrue(deque.deleteLast());
        assertEquals(1, deque.getRear());

        // deleteLast 테스트
        assertTrue(deque.deleteLast());
        assertTrue(deque.isEmpty());

        // deleteLast 실패 테스트 (덱이 비어 있음)
        assertFalse(deque.deleteLast());

        // getFront와 getRear 실패 테스트 (덱이 비어 있음)
        assertEquals(-1, deque.getFront());
        assertEquals(-1, deque.getRear());
    }
}