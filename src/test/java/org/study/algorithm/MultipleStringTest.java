package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleStringTest {
    private MultipleString mulStr;

    @BeforeEach
    void setUp() { mulStr = new MultipleString(); }
    @Test
    void solution() {
        String result = mulStr.solution("love", 3);
        assertEquals("lovelovelove", result);
    }
}