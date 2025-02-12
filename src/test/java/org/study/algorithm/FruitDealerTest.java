package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitDealerTest {
    private FruitDealer fruitDealer;
    @BeforeEach
    void setUp() {
        fruitDealer = new FruitDealer();
    }

    @Test
    void solution() {
        int result1 = fruitDealer.solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1});
        int result2 = fruitDealer.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});

        assertEquals(8, result1);
        assertEquals(33, result2);
    }
}