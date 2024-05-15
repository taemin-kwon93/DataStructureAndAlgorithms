package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateCharactersTest {

    private ConcatenateCharacters conCatChar;

    @BeforeEach
    void setUp() {
        conCatChar = new ConcatenateCharacters();
    }

    @Test
    void solution() {
        // Given
        String a = "cvsgiorszzzmrpaqpe";
        int[] b = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        // When
        String result = conCatChar.solution(a, b);

        //Then
        assertEquals("programmers", result);

    }

}