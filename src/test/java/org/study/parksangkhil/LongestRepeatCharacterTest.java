package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatCharacterTest {
    private LongestRepeatCharacter longestRepeatCharacter;

    @BeforeEach
    void setUp() {
        longestRepeatCharacter = new LongestRepeatCharacter();
    }

    @Test
    void characterReplacement() {
        int result1 = longestRepeatCharacter.characterReplacement("ABAB", 2);
        int result2 = longestRepeatCharacter.characterReplacement("AABABBA", 1);
        int result3 = longestRepeatCharacter.characterReplacement("AAAA", 2);

        assertEquals(4, result1);
        assertEquals(4, result2);
        assertEquals(4, result3);
    }
}