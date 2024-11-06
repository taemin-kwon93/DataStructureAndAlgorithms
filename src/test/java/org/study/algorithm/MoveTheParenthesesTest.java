package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTheParenthesesTest {
    private MoveTheParentheses moveTheParentheses;

    @BeforeEach
    void setUp() {
        moveTheParentheses = new MoveTheParentheses();
    }

    @Test
    void solution() {
        int result1 = moveTheParentheses.solution("{}([])");
        int result2 = moveTheParentheses.solution("[](){}");
        assertEquals(2, result1);
        assertEquals(3, result2);
    }
}