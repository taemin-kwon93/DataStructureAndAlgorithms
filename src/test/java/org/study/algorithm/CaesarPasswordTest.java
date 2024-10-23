package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarPasswordTest {
    private CaesarPassword caesarPassword;

    @BeforeEach
    void setUp() {
        caesarPassword = new CaesarPassword();
    }

    @Test
    void solution() {
        String result1 = caesarPassword.solution("AB", 1);
        String result2 = caesarPassword.solution("z", 1);
        String result3 = caesarPassword.solution("a B z", 4);

        assertEquals("BC", result1);
        assertEquals("a", result2);
        assertEquals("e F d", result3);
    }
}