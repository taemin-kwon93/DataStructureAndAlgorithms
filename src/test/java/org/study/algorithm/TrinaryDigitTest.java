package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TrinaryDigitTest {
    private TrinaryDigit trinaryDigit;

    @BeforeEach
    void setUp() {
        trinaryDigit = new TrinaryDigit();
    }

    @ParameterizedTest
    @CsvSource({
            "45, 7",
            "125, 229"
    })
    void solution(int x, int expected) {
        int result = trinaryDigit.solution(x);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "45, 7",
            "125, 229"
    })
    void solutionB(int x, int expected) {
        int result = trinaryDigit.solutionB(x);

        assertEquals(expected, result);
    }
}