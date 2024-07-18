package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankStudentsByAverageScoreTest {
    private RankStudentsByAverageScore rankStudentsByAverageScore;

    @BeforeEach
    void setUp() {
        rankStudentsByAverageScore = new RankStudentsByAverageScore();
    }

    @Test
    void solution() {
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[] expected = {4, 4, 6, 2, 2, 1, 7};

        int[] result = rankStudentsByAverageScore.solution(score);

        assertArrayEquals(expected, result);
    }
}