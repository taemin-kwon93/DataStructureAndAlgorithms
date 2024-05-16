package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManipulateNumber1Test {
    private ManipulateNumber1 maniNum;

    @BeforeEach
    void setUp() {
        maniNum = new ManipulateNumber1();
    }

    @Test
    void solution() {
        int result = maniNum.solution(0, "wsdawsdassw");
        assertEquals(-1, result);
    }
}