package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {
    private JewelsAndStones jewelsAndStones;

    @BeforeEach
    void setUp() {
        jewelsAndStones = new JewelsAndStones();
    }

    @Test
    void solution() {
        String s = "aAAbbbb";
        String j = "aA";
        int expected = 3;

        int result = jewelsAndStones.solution(s, j);

        assertEquals(expected, result);
    }
}