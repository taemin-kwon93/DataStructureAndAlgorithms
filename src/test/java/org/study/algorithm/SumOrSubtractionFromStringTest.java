package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOrSubtractionFromStringTest {
    private SumOrSubtractionFromString sumOrSubtractionFromString;

    @BeforeEach
    void setUp() {
        sumOrSubtractionFromString = new SumOrSubtractionFromString();
    }

    @Test
    void solution() {
        int result = sumOrSubtractionFromString.solution("40 - 30 - 10");

        assertEquals(0, result);
    }
}