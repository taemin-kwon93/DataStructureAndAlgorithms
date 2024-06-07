package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeCenterCharactersTest {
    private TakeCenterCharacters takeCenterCharacters;

    @BeforeEach
    void setUp() {
        takeCenterCharacters = new TakeCenterCharacters();
    }
    @Test
    void case1() {
        String result = takeCenterCharacters.solution("abcde");
        assertEquals("c", result);
    }

    @Test
    void case2() {
        String result = takeCenterCharacters.solution("qwer");
        assertEquals("we", result);
    }

    @Test
    void case3() {
        String result = takeCenterCharacters.solution("a");
        assertEquals("a", result);
    }

    @Test
    void case4() {
        String result = takeCenterCharacters.solution("");
        assertEquals("", result);
    }
}