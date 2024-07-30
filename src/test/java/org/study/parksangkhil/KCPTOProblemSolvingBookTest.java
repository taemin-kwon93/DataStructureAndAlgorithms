package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KCPTOProblemSolvingBookTest {
    private KCPTOProblemSolvingBook kcptoProblemSolvingBook;

    @BeforeEach
    void setUp() {
        kcptoProblemSolvingBook = new KCPTOProblemSolvingBook();
    }

    @Test
    void kClosest() {
        int k = 2;
        int[][] points = {{3, 3}, {6, 2}, {-2, 4}};
        int[][] expected = {{3, 3}, {-2, 4}};

        int[][] result = kcptoProblemSolvingBook.kClosest(points, k);

        assertArrayEquals(expected, result);
    }
}