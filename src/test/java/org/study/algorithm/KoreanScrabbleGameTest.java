package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KoreanScrabbleGameTest {
    private KoreanScrabbleGame ksg;

    @BeforeEach
    void setUp() {
        ksg = new KoreanScrabbleGame();
    }

    @Test
    void solution() {
        String[] words1 = {"tank", "kick", "know",
                "wheel", "land", "dream",
                "mother", "robot", "tank"};

        String[] words2 = {"hello", "observe", "effect",
                "take", "either", "recognize",
                "encourage", "ensure", "establish",
                "hang", "gather", "refer",
                "reference", "estimate", "executive"};

        String[] words3 = {"hello", "one", "even",
                "never", "now", "world", "draw"};

        int[] expected1 = {3, 3};
        int[] expected2 = {0, 0};
        int[] expected3 = {1, 3};

        int[] result1 = ksg.solution(3, words1);
        int[] result2 = ksg.solution(5, words2);
        int[] result3 = ksg.solution(2, words3);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}