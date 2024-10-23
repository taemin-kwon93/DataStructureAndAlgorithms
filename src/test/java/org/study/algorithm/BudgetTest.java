package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
    private Budget budget;

    @BeforeEach
    void setUp() {
        budget = new Budget();
    }

    @Test
    void solution() {
        int[] d1 = {2, 2, 3, 3};
        int[] d2 = {2, 2, 3, 3};

        int result1 = budget.solution(d1, 9);
        int result2 = budget.solution(d2, 10);

        assertEquals(3, result1);
        assertEquals(4, result2);
    }
}