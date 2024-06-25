package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDescendingSorterTest {
    private StringDescendingSorter stringDescendingSorter;

    @BeforeEach
    void setUp() {
        stringDescendingSorter = new StringDescendingSorter();
    }

    @Test
    void solution() {
        String s = "Zbcdefg";

        String result = stringDescendingSorter.solution(s);

        assertEquals("gfedcbZ", result);
    }
}