package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformSequenceTest {
    private TransformSequence transformSequence;

    @BeforeEach
    void setUp() {
        transformSequence = new TransformSequence();
    }

    @Test
    void shouldReturnTransformedArrayWhenKOdd() {
        int[] result = transformSequence.solution(new int[] {1, 2, 3, 100, 99, 98}, 3);
        assertArrayEquals(new int[] {3, 6, 9, 300, 297, 294}, result);
    }

    @Test
    void shouldReturnTransformedArrayWhenKEven() {
        int[] result = transformSequence.solution(new int[] {1, 2, 3, 100, 99, 98}, 2);
        assertArrayEquals(new int[] {3, 4, 5, 102, 101, 100}, result);
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] result = transformSequence.solution(new int[] {}, 3);
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    void shouldHandleSingleElementArrayWhenKOdd() {
        int[] result = transformSequence.solution(new int[] {7}, 3);
        assertArrayEquals(new int[] {21}, result);
    }

    @Test
    void shouldHandleSingleElementArrayWhenKEven() {
        int[] result = transformSequence.solution(new int[] {7}, 2);
        assertArrayEquals(new int[] {9}, result);
    }
}