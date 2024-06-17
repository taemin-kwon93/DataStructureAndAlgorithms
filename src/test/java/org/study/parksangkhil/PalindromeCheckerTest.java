package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    private PalindromeChecker palindromeChecker;

    @BeforeEach
    void setUp() {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    void shouldReturnTrueWhenMatched() {
        boolean result = palindromeChecker.solution("Do geese see God");
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenNotMatched() {
        boolean result = palindromeChecker.solution("Do I see God");
        assertFalse(result);
    }
}