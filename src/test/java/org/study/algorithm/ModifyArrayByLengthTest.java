package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifyArrayByLengthTest {
    private ModifyArrayByLength modifyArrayByLength;

    @BeforeEach
    void setUp() {
        modifyArrayByLength = new ModifyArrayByLength();
    }

    @Test
    void shouldReturnModifiedArrayWhenLengthIsOdd() {
        int[] result = modifyArrayByLength.solution(new int[] {49, 12, 100, 276, 33}, 27);
        assertArrayEquals(new int[] {76, 12, 127, 276, 60}, result);
    }

    @Test
    void shouldReturnModifiedArrayWhenLengthIsEven() {
        int[] result = modifyArrayByLength.solution(new int[] {444, 555, 666, 777}, 100);
        assertArrayEquals(new int[] {444, 655, 666, 877}, result);
    }
}