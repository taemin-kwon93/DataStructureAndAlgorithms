package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HallOfFameTest {
    private HallOfFame hallOfFame;

    @BeforeEach
    void setUp() {
        hallOfFame = new HallOfFame();
    }

    @Test
    void solution() {
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] expected1 = {10, 10, 10, 20, 20, 100, 100};
        int[] expected2 = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};

        int[] result1 = hallOfFame.solution(3, score1);
        int[] result2 = hallOfFame.solution(4, score2);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
    }

    @Test
    void solution2() {
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] expected1 = {10, 10, 10, 20, 20, 100, 100};
        int[] expected2 = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};

        int[] result1 = hallOfFame.solution2(3, score1);
        int[] result2 = hallOfFame.solution2(4, score2);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
    }
}