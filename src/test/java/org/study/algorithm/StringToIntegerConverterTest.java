package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerConverterTest {
    private StringToIntegerConverter stringToIntegerConverter;

    @BeforeEach
    void setUp() {
        stringToIntegerConverter = new StringToIntegerConverter();
    }

    @Test
    void solution() {
        int result = stringToIntegerConverter.solution("123");
        assertEquals(123, result);
    }
}