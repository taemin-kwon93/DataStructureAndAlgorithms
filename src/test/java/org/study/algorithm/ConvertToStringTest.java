package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToStringTest {
    private ConvertToString convertToString;

    @BeforeEach
    void setUp() {
        convertToString = new ConvertToString();
    }

    @Test
    void solution() {
        String result = convertToString.solution(1234);
        assertEquals("1234", result);
    }
}