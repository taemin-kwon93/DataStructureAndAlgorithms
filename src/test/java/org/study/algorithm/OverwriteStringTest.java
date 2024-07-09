package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverwriteStringTest {
    private OverwriteString overwriteString;

    @BeforeEach
    void setUp() {
        overwriteString = new OverwriteString();
    }

    @Test
    void solution() {
        String oldString = "He11oWor1d";
        String newString = "lloWorl";
        int x = 2;

        String result = overwriteString.solution(oldString, newString, x);

        assertEquals("HelloWorld", result);
    }
}