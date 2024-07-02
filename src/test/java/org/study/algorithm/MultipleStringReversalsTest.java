package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleStringReversalsTest {
    private MultipleStringReversals multipleStringReversals;

    @BeforeEach
    void setUp() {
        multipleStringReversals = new MultipleStringReversals();
    }

    @Test
    void solution() {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String expected = "programmers";

        String result = multipleStringReversals.solution(my_string, queries);

        assertEquals(expected, result);
    }
}