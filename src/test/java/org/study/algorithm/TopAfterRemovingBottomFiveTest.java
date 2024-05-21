package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopAfterRemovingBottomFiveTest {
    private TopAfterRemovingBottomFive topAfterRemovingBottomFive;

    @BeforeEach
    void setUp() {
        topAfterRemovingBottomFive = new TopAfterRemovingBottomFive();
    }

    @Test
    void solution() {
        int[] result = topAfterRemovingBottomFive.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
        assertArrayEquals(new int[]{15, 32, 38, 46, 56}, result);
    }

    @Test
    void solution2() {
        int[] result = topAfterRemovingBottomFive.solution2(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
        assertArrayEquals(new int[]{15, 32, 38, 46, 56}, result);
    }
}