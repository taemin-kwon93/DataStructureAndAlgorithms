package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleOfNTest {
    private MultipleOfN mulN;
    @BeforeEach
    void setUp() {
        mulN = new MultipleOfN();
    }
    @Test
    void whenNumIsMultipleOfN() {
        int result = mulN.solution(98, 2);
        assertEquals(1, result);
    }

    @Test
    void whenNumIsNotMultipleOfN() {
        int result = mulN.solution(97, 2);
        assertEquals(0, result);
    }
}