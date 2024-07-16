package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SmallSubstringsCounterTest {
    private SmallSubstringsCounter smallSubstringsCounter;

    @BeforeEach
    void setUp() {
        smallSubstringsCounter = new SmallSubstringsCounter();
    }

    @ParameterizedTest
    @CsvSource({
            "'3141592','271',2",
            "'500220839878','7',8",
            "'10203','15',3",
            "'','',0",
    })
    void solution(String t, String p, int expected) {
        int result = smallSubstringsCounter.solution(t, p);
        assertEquals(expected, result);
    }
}
