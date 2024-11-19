package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Year2016Test {
    private Year2016 year2016;

    @BeforeEach
    void setUp() {
        year2016 = new Year2016();
    }

    @Test
    void solution() {
        String result = year2016.solution(5, 24);
        assertEquals("TUE", result);
    }
}