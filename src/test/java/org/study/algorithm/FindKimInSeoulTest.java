package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKimInSeoulTest {
    private FindKimInSeoul findKimInSeoul;
    String expected = "김서방은 1에 있다";

    @BeforeEach
    void setUp() {
        findKimInSeoul = new FindKimInSeoul();
    }

    @Test
    void solution() {
        String[] seoul = {"Tom", "Kim", "Gates"};

        String result = findKimInSeoul.solution(seoul);

        assertEquals(expected, result);
    }

    @Test
    void solution2() {
        String[] seoul = {"Tom", "Kim", "Gates"};
        String result = findKimInSeoul.solution2(seoul);
        assertEquals(expected, result);
    }
}