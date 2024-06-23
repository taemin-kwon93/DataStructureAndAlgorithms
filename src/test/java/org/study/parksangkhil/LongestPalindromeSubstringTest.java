package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubstringTest {
    private LongestPalindromeSubstring longestPalindromeSubstring;

    @BeforeEach
    void setUp() {
        longestPalindromeSubstring = new LongestPalindromeSubstring();
    }

    @Test
    void solution() {
        String s = "dcbabcdd";
        String expected = "dcbabcd";

        String result = longestPalindromeSubstring.solution(s);

        assertEquals(expected, result);
    }
}