package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintingTest {
    private Painting painting;

    @BeforeEach
    void setUp() {
        painting = new Painting();
    }

    @Test
    void solution() {
        int[] section1 = {2, 3, 6};
        int[] section2 = {1, 3};
        int[] section3 = {1, 2, 3, 4};
        int[] section4 = {1, 2, 3, 4};

        int result1 = painting.solution(8, 4, section1);
        int result2 = painting.solution(5, 4, section2);
        int result3 = painting.solution(4, 1, section3);
        int result4 = painting.solution(4, 2, section4);

        assertEquals(2, result1);
        assertEquals(1, result2);
        assertEquals(4, result3);
        assertEquals(2, result4);
    }
}