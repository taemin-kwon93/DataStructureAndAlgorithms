package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityMatrixGeneratorTest {
    private IdentityMatrixGenerator identityMatrixGenerator;

    @BeforeEach
    void setUp() {
        identityMatrixGenerator = new IdentityMatrixGenerator();
    }

    @Test
    void solution() {
        int[][] a = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        int[][] result = identityMatrixGenerator.solution(3);

        assertArrayEquals(a, result);
    }
}