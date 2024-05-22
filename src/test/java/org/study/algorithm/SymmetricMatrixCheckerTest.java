package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricMatrixCheckerTest {
    private SymmetricMatrixChecker symmetricMatrixChecker;

    @BeforeEach
    void setUp() {
        symmetricMatrixChecker = new SymmetricMatrixChecker();
    }

    @Test
    void shouldReturnOneWhenMatrixIsSymmetric() {
        int[][] a = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int result = symmetricMatrixChecker.solution(a);
        assertEquals(1, result);
    }

    @Test
    void shouldReturnZeroWhenMatrixIsNotSymmetric() {
        int[][] a = {{5, 6, 33}, {192, 72, 95}, {33, 95, 999}};
        int result = symmetricMatrixChecker.solution(a);
        assertEquals(0, result);
    }
}