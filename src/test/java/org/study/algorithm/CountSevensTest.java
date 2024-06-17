package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSevensTest {
    private CountSevens countSevens;

    @BeforeEach
    void setUp() {
        countSevens = new CountSevens();
    }

    @Test
    void solution() {
        int[] array = {7, 77, 17};
        int result = countSevens.solution(array);
        assertEquals(4, result);
    }
}