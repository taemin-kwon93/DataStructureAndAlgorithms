package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringEndingWithTest {
    private LongestSubstringEndingWith longestSubstringEndingWith;

    @BeforeEach
    void setUp() {
        longestSubstringEndingWith = new LongestSubstringEndingWith();
    }

    @Test
    void solution() {
        String result = longestSubstringEndingWith.solution("AAAAaaaa", "a");
        assertEquals("AAAAaaaa", result);
    }
}