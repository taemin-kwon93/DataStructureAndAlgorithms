package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScovilleSacleTest {
    private ScovilleScale scovilleScale;

    @BeforeEach
    void setUp() {
        scovilleScale = new ScovilleScale();
    }

    @Test
    void solution() {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int expected = 2;

        int result = scovilleScale.solution(scoville, k);

        assertEquals(expected, result);
    }
}