package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGame1Test {
    private DiceGame1 diceGame1;

    @BeforeEach
    void setUp() {
        diceGame1 = new DiceGame1();
    }

    @Test
    void whenNumbersAreOdd() {
        int result = diceGame1.solution(1, 5);
        assertEquals(26, result);
    }

    @Test
    void whenNumbersAreEven() {
        int result = diceGame1.solution(2, 4);
        assertEquals(2, result);
    }

    @Test
    void whenOneIsOddTheOtherIsEven() {
        int result = diceGame1.solution(6, 1);
        assertEquals(14, result);
    }
}