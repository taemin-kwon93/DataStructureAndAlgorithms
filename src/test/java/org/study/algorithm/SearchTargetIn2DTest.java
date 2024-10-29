package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTargetIn2DTest {
    private SearchTargetIn2D searchTargetIn2D;

    @BeforeEach
    void setUp() {
        searchTargetIn2D = new SearchTargetIn2D();
    }

    @Test
    void searchMatrix() {
        int[][] matrix1 = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int[][] matrix2 = {{-5}};

        boolean result1 = searchTargetIn2D.searchMatrix(matrix1, 5);
        boolean result2 = searchTargetIn2D.searchMatrix(matrix2, -5);

        assertTrue(result1);
        assertTrue(result2);
    }
}