package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ChickenAndCouponTest {
    private ChickenAndCoupon chickenAndCoupon;

    @BeforeEach
    void setUp() {
        chickenAndCoupon = new ChickenAndCoupon();
    }

    @ParameterizedTest
    @CsvSource({
            "1081,120",
            "100,11",
            "1999,222",
            "997281,110808"
    })
    void solution(int chicken, int expected) {
        int result = chickenAndCoupon.solution(chicken);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1081,120",
            "100,11",
            "1999,222",
            "997281,110808"
    })
    void solutionB(int chicken, int expected) {
        int result = chickenAndCoupon.solutionB(chicken);
        assertEquals(expected, result);
    }
}