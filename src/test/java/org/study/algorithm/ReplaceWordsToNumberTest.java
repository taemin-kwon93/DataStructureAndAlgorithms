package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceWordsToNumberTest {
    private ReplaceWordsToNumber replaceWordsToNumber;

    @BeforeEach
    void setUp() {
        replaceWordsToNumber = new ReplaceWordsToNumber();
    }
    @Test
    void solution() {
        long result = replaceWordsToNumber.solution("onetwothreefourfivesixseveneightnine");
        assertEquals(123456789, result);
    }
}