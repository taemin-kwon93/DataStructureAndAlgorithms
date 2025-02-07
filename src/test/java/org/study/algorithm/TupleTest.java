package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    private Tuple tuple;

    @BeforeEach
    void setUp() {
        tuple = new Tuple();
    }

    @Test
    void solution() {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] expected = {2, 1, 3, 4};

        int[] result = tuple.solution(s);

        assertArrayEquals(expected, result);
    }
}