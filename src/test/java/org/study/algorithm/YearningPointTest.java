package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearningPointTest {
    private YearningPoint yearningPoint;

    @BeforeEach
    void setUp() {
        yearningPoint = new YearningPoint();
    }

    @Test
    void solution() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        int[] expected = {5, 15, 0};

        int[] result = yearningPoint.solution(name, yearning, photo);

        assertArrayEquals(expected, result);
    }
}
