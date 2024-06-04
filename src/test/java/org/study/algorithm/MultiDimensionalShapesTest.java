package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiDimensionalShapesTest {
    private MultiDimensionalShapes multiDimensionalShapes;

    @BeforeEach
    void setUp() {
        multiDimensionalShapes = new MultiDimensionalShapes();
    }

    @Test
    void solution() {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        int[][] expected = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

        int[][] result = multiDimensionalShapes.solution(num_list, n);

        assertArrayEquals(expected, result);
    }
}