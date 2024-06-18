package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlZCalculatorTest {
    private ControlZCalculator controlZCalculator;

    @BeforeEach
    void setUp() {
        controlZCalculator = new ControlZCalculator();
    }

    @Test
    void solution() {
        String s = "-1 -2 -3 Z";

        int result = controlZCalculator.solution(s);

        assertEquals(-3, result);
    }
}