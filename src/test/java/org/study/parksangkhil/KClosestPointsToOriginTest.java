package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {
    private KClosestPointsToOrigin kCPTO;

    @BeforeEach
    void setUp() {
        kCPTO = new KClosestPointsToOrigin();
    }

    @Test
    void kClosest() {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] expected = {{-2, 4}, {3, 3}};
        int k = 2;

        int[][] result = kCPTO.kClosest(points, k);
        assertArrayEquals(expected, result);
    }
}