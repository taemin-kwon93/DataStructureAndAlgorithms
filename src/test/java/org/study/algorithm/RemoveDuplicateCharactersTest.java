package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharactersTest {
    private RemoveDuplicateCharacters rmDuplChar;

    @BeforeEach
    void setUp() {
        rmDuplChar = new RemoveDuplicateCharacters();
    }

    @Test
    void solution() {
        String result = rmDuplChar.solution("people");
        assertEquals("peol", result);
    }

    @Test
    void solution2() {
        String result = rmDuplChar.solution2("people");
        assertEquals("peol", result);
    }
}