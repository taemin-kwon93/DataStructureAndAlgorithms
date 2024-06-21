package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {
    private MostCommonWord mostCommonWord;

    @BeforeEach
    void setUp() {
        mostCommonWord = new MostCommonWord();
    }

    @Test
    void solution() {
        String s = "Ross hit a ball, the hit BALL flew far away after it was hit.";
        String banned = "hit";

        String result = mostCommonWord.solution(s, banned);

        assertEquals("ball", result);
    }

    @Test
    void solutionB() {
        String s = "Ross hit a ball, the hit BALL flew far away after it was hit.";
        String[] banned = {"hit"};

        String result = mostCommonWord.solutionB(s, banned);

        assertEquals("ball", result);
    }
}