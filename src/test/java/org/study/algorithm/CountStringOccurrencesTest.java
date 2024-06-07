package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountStringOccurrencesTest {
    private CountStringOccurrences countStringOccurrences;

    @BeforeEach
    void setUp() {
        countStringOccurrences = new CountStringOccurrences();
    }

    @Test
    void case1() {
        int result = countStringOccurrences.solution("aaaa", "aa");
        assertEquals(3, result);
    }

    @Test
    void case2() {
        int result = countStringOccurrences.solution("banana", "ana");
        assertEquals(2, result);
    }
}