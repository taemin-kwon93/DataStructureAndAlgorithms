package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGame2Test {
    private DiceGame2 diceGame2;

    @BeforeEach
    void setUp() {
        diceGame2 = new DiceGame2();
    }

    @Test
    void shouldReturnForAllSame() {
        int result = diceGame2.solution(4, 4, 4);
        assertEquals(110592, result);
    }

    @Test
    void shouldReturnForTwoSameOneDifferent() {
        int result = diceGame2.solution(4, 4, 3);
        assertEquals((4 + 4 + 3) * (4*4 + 4*4 + 3*3), result);
    }

    @Test
    void shouldReturnForAllDifferent() {
        int result = diceGame2.solution(1, 2, 3);
        assertEquals(1 + 2 + 3, result);
    }

}