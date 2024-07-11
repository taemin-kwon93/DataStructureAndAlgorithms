package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfSquareTest {
    private AreaOfSquare areaOfSquare;

    @BeforeEach
    void setUp() {
        areaOfSquare = new AreaOfSquare();
    }

    @Test
    void solution() {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        int result = areaOfSquare.solution(dots);

        assertEquals(4, result);
    }
}