package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsContainCharacterTest {
    private IsContainCharacter isContainCharacter;

    @BeforeEach
    void setUp() {
        isContainCharacter = new IsContainCharacter();
    }

    @Test
    void shouldReturnTrueWhenSisNumber() {
        String s = "1234";
        boolean result = isContainCharacter.solution(s);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenSLengthIsNotFourOrSix() {
        String s = "12234";
        boolean result = isContainCharacter.solution(s);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenSIsNotNumber() {
        String s = "1a34";
        boolean result = isContainCharacter.solution(s);
        assertFalse(result);
    }
}
