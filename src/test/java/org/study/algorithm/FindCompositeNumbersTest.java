package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCompositeNumbersTest {
    private FindCompositeNumbers findCompositeNumbers;

    @BeforeEach
    void setUp() {
        findCompositeNumbers = new FindCompositeNumbers();
    }

    @Test
    void solution() {
        int result = findCompositeNumbers.solution(500000); // 9sec 820ms
        assertEquals(458461, result);
    }

    @Test
    void solution2() {
        int result = findCompositeNumbers.solution2(500000); // 19ms
        assertEquals(458461, result);
    }
}