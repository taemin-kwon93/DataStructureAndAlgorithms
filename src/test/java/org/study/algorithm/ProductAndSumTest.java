package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductAndSumTest {
    private ProductAndSum ps;

    @BeforeEach
    void setUp() {
        ps = new ProductAndSum();
    }

    @Test
    void solution() {
        int result = ps.solution(new int[] {5, 7, 8, 3});
        assertEquals(0, result);
    }
}