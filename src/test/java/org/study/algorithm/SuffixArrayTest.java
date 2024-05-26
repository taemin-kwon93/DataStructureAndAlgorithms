package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuffixArrayTest {
    private SuffixArray suffixArray;

    @BeforeEach
    void setUp() {
        suffixArray = new SuffixArray();
    }

    @Test
    void solution() {
        String[] expected = {"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"};
        String[] result = suffixArray.solution("programmers");
        assertArrayEquals(expected, result);
    }
}