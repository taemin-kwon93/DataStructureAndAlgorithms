package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QrCodeTest {
    private QrCode qrCode;

    @BeforeEach
    void setUp() {
        qrCode = new QrCode();
    }

    @Test
    void solution() {
        String s = "qjnwezgrpirldywt";
        int q = 3;
        int r = 1;

        String result = qrCode.solution(q, r, s);

        assertEquals("jerry", result);
    }
}