package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceGeneratorTest {
    private NumberSequenceGenerator numberSequenceGenerator;

    @BeforeEach
    void setUp() {
        numberSequenceGenerator = new NumberSequenceGenerator();
    }

    @Test
    void solution() {
        long[] expected = {2, 4, 6, 8, 10};

        long[] result = numberSequenceGenerator.solution(2, 5);

        assertArrayEquals(expected, result);
    }

}