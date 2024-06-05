package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesOfKTest {
    private CountOccurrencesOfK countOccurrencesOfK;

    @BeforeEach
    void setUp() {
        countOccurrencesOfK = new CountOccurrencesOfK();
    }

    @Test
    void solution() {
        int result = countOccurrencesOfK.solution(1, 13, 1);
        assertEquals(6, result);
    }
}