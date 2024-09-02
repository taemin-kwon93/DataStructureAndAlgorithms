package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeTest {
    private NetworkDelayTime networkDelayTime;

    @BeforeEach
    void setUp() {
        networkDelayTime = new NetworkDelayTime();
    }

    @Test
    void networkDelayTime() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;

        int expected = 2;

        int result = networkDelayTime.networkDelayTime(times, n, k);

        assertEquals(expected, result);
    }
}