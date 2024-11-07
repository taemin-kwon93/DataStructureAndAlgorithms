package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UTF8ValidationTest {
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

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}