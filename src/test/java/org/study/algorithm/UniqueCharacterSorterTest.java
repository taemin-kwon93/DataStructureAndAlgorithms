package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharacterSorterTest {
    private UniqueCharacterSorter uniqueCharacterSorter;

    @BeforeEach
    void setUp() {
        uniqueCharacterSorter = new UniqueCharacterSorter();
    }

    @Test
    void solution() {
        String s = "abcabcadc";

        String result = uniqueCharacterSorter.solution(s);

        assertEquals("d", result);
    }

    @Test
    void solution2() {
        String s = "abcabcadc";

        String result = uniqueCharacterSorter.solution2(s);

        assertEquals("d", result);
    }
}