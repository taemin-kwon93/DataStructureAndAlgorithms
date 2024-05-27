package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemainderByNineTest {
    private RemainderByNine remainderByNine;

    @BeforeEach
    void setUp() {
        remainderByNine = new RemainderByNine();
    }

    @Test
    void solution() {
        int result = remainderByNine.solution("78720646226947352489");
        assertEquals(2, result);
    }
}