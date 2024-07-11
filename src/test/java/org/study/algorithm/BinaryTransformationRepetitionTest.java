package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTransformationRepetitionTest {
    BinaryTransformationRepetition binaryTransformationRepetition;

    @BeforeEach
    void setUp() {
        binaryTransformationRepetition = new BinaryTransformationRepetition();
    }

    @Test
    void solution() {
        String s = "110010101001";
        int[] expected = {3, 8};

        int[] result = binaryTransformationRepetition.solution(s);

        assertArrayEquals(expected, result);
    }
}