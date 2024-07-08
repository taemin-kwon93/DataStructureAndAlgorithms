package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseMakerTest {
    private JadenCaseMaker jadenCaseMaker;

    @BeforeEach
    void setUp() {
        jadenCaseMaker = new JadenCaseMaker();
    }

    @Test
    void solution() {
        String s = "  3people  unFollowed me  ";
        String expected = "  3people  Unfollowed Me  ";

        String result = jadenCaseMaker.solution(s);

        assertEquals(expected, result);
    }
}