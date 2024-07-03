package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfCasesTest {
    private NumberOfCases numberOfCases;

    @BeforeEach
    void setUp() {
        numberOfCases = new NumberOfCases();
    }

    @Test
    void solution() {
        assertEquals(new BigInteger("1"), numberOfCases.solution(30, 0));
        assertEquals(new BigInteger("30"), numberOfCases.solution(30, 1));
        assertEquals(new BigInteger("435"), numberOfCases.solution(30, 2));
        assertEquals(new BigInteger("142506"), numberOfCases.solution(30, 5));
    }
}