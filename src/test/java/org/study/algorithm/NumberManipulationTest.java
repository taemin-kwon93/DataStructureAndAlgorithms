package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberManipulationTest {
    private NumberManipulation numberManipulation;

    @BeforeEach
    void setUp() {
        numberManipulation = new NumberManipulation();
    }

    @Test
    void solution() {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = numberManipulation.solution(numLog);
        assertEquals("wsdawsdassw", result);
    }

}