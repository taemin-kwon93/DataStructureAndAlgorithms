package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCardTest {
    private NumberCard numberCard;

    @BeforeEach
    void setUp() {
        numberCard = new NumberCard();
    }

    @Test
    void solution() {
        int result1 = numberCard.solution("one4seveneight");
        int result2 = numberCard.solution("23four5six7");
        int result3 = numberCard.solution("1zerotwozero3");

        assertEquals(1478, result1);
        assertEquals(234567, result2);
        assertEquals(10203, result3);
    }
}