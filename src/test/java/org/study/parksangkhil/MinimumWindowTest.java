package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowTest {
    private MinimumWindow minimumWindow;

    @BeforeEach
    void setUp() {
        minimumWindow = new MinimumWindow();
    }

    @Test
    void minWindow() {
        String result1 = minimumWindow.minWindow("ABDOBECODEBANC", "ABC");
        String result2 = minimumWindow.minWindow("ABBBBCCCAAABBCCACCBBABC", "ABC");
        String result3 = minimumWindow.minWindow("DDDDDDDDDDDDDDDDDDDDABC", "ABC");
        assertEquals("BANC", result1);
        assertEquals("ABC", result2);
        assertEquals("ABC", result3);
    }
}