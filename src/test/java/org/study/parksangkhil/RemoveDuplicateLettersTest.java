package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {
    private RemoveDuplicateLetters removeDuplicateLetters;

    @BeforeEach
    void setUp() {
        removeDuplicateLetters = new RemoveDuplicateLetters();
    }

    @Test
    void solution() {
        String s = "dbacdcbc";
        String expected = "acdb";

        String result = removeDuplicateLetters.solution(s);

        assertEquals(expected, result);
    }
}