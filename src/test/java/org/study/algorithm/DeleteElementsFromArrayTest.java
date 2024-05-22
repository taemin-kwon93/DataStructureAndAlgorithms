package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteElementsFromArrayTest {
    private DeleteElementsFromArray deleteElementsFromArray;

    @BeforeEach
    void setUp() {
        deleteElementsFromArray = new DeleteElementsFromArray();
    }

    @Test
    void solution() {
        int[] a = {293, 1000, 395, 678, 94};
        int[] b = {94, 777, 104, 1000, 1, 12};
        int[] result = deleteElementsFromArray.solution(a, b);
        assertArrayEquals(new int[] {293, 395, 678}, result);
    }
}