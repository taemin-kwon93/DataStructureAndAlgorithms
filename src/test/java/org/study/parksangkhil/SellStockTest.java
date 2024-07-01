package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellStockTest {
    private SellStock sellStock;

    @BeforeEach
    void setUp() {
        sellStock = new SellStock();
    }

    @Test
    void solution() {
        int[] x = {8, 1, 5, 6, 4};

        int result = sellStock.solution(x);

        assertEquals(5, result);
    }

    @Test
    void solutionB() {
        int[] x = {8, 1, 5, 6, 4};

        int result = sellStock.solutionB(x);

        assertEquals(5, result);
    }
}