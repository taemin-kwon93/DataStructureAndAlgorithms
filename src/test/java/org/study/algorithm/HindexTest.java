package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HindexTest {
    private Hindex hindex;

    @BeforeEach
    void setUp() {
        hindex = new Hindex();
    }

    @Test
    void solution() {
        int[] citations1 = {3, 0, 6, 1, 5};
        int[] citations2 = {5, 6, 7, 8};
        int[] citations3 = {0, 1, 2, 3, 5, 6, 7};
        int[] citations4 = {1, 3, 1};
        int[] citations5 = {1};
        int[] citations6 = {0, 1, 0};

        int result1 = hindex.solution(citations1);
        int result2 = hindex.solution(citations2);
        int result3 = hindex.solution(citations3);
        int result4 = hindex.solution(citations4);
        int result5 = hindex.solution(citations5);
        int result6 = hindex.solution(citations6);

        assertEquals(3, result1);
        assertEquals(4, result2);
        assertEquals(3, result3);
        assertEquals(1, result4);
        assertEquals(1, result5);
        assertEquals(1, result6);
    }
}