package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandArrayByCountTest {
    private ExpandArrayByCount expandArrayByCount;

    @BeforeEach
    void setUp() {
        expandArrayByCount = new ExpandArrayByCount();
    }

    @Test
    void solution() {
        int[] result = expandArrayByCount.solution(new int[] {5, 1, 4});
        assertArrayEquals(new int[] {5, 5, 5, 5, 5, 1, 4, 4, 4, 4}, result);
    }
}