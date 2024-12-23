package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    private ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    void climbStairs() {
        int result = climbingStairs.climbStairs(44);
        assertEquals(1134903170, result);
    }

    @Test
    void climbStairsMemo() {
        int result = climbingStairs.climbStairsMemo(44);
        assertEquals(1134903170, result);
    }
}