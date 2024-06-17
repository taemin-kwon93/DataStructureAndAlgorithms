package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerProductTest {
    private InnerProduct innerProduct;

    @BeforeEach
    void setUp() {
        innerProduct = new InnerProduct();
    }

    @Test
    void solution() {
        int[] a = {1,2,3,4};
        int[] b = {-3, -1, 0, 2};

        int result = innerProduct.solution(a, b);
        assertEquals(3, result);
    }
}