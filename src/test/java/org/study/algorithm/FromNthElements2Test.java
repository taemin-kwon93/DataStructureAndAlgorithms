package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FromNthElements2Test {

    private FromNthElements2 fromNthElem2;

    @BeforeEach
    public void setUp() {
        fromNthElem2 = new FromNthElements2();
    }

    @Test
    public void validateSolution() {
        //Given
        String a = "ProgrammerS123";
        String result = fromNthElem2.solution(a, 11);

        assertEquals("grammerS123", result);
    }

}
