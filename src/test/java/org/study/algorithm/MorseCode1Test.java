package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCode1Test {
    private MorseCode1 morseCode1;

    @BeforeEach
    void setUp() {
        morseCode1 = new MorseCode1();
    }

    @Test
    void solution() {
        String letter = ".... . .-.. .-.. ---";

        String result = morseCode1.solution(letter);

        assertEquals("hello", result);
    }
}