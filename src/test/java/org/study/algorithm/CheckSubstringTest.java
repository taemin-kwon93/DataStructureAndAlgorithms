package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubstringTest {
    private CheckSubstring checkSubstring;

    @BeforeEach
    void setUp() {
        checkSubstring = new CheckSubstring();
    }

    @Test
    void shouldReturnOneWhenStringIsContains() {
        int result = checkSubstring.solution("banana", "ana");
        assertEquals(1, result);
    }

    @Test
    void shouldReturnZeroWhenStringIsNotContains() {
        int result = checkSubstring.solution("test", "sss");
        assertEquals(0, result);
    }
}