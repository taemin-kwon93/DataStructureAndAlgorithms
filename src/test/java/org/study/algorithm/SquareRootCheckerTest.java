package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootCheckerTest {
    private SquareRootChecker squareRootChecker;

    @BeforeEach
    void setUp() {
        squareRootChecker = new SquareRootChecker();
    }
    @Test
    void shouldReturnNumberWhenFound() {
        long result = squareRootChecker.solution(121);
        assertEquals(144, result);
    }

    @Test
    void shouldReturnMinusOneWhenNotFoundSquareRoot() {
        long result = squareRootChecker.solution(3);
        assertEquals(-1, result);
    }

    @Test
    void solution() {
        long result = squareRootChecker.solution(1);
        assertEquals(4, result);
    }
}