package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Utf8ValidationTest {
    private Utf8Validation utf8Validation;

    @BeforeEach
    void setUp() {
        utf8Validation = new Utf8Validation();
    }

    @Test
    void validUtf8() {
        int[] data1 = {197, 130, 1};
        int[] data2 = {235, 140, 4};
        int[] data3 = {255};
        int[] data4 = {145};
        int[] data5 = {248,130,130,130};

        boolean result1 = utf8Validation.validUtf8(data1);
        boolean result2 = utf8Validation.validUtf8(data2);
        boolean result3 = utf8Validation.validUtf8(data3);
        boolean result4 = utf8Validation.validUtf8(data4);
        boolean result5 = utf8Validation.validUtf8(data5);

        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertFalse(result5);
    }
}