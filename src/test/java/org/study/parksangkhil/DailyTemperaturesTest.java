package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    private DailyTemperatures dailyTemp;
    @BeforeEach
    void setUp() {
        dailyTemp = new DailyTemperatures();
    }

    @Test
    void dailyTemperatures() {
        int[] temperatures = {23, 24, 25, 21, 19, 22, 26, 23};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};

        int[] result = dailyTemp.dailyTemperatures(temperatures);

        assertArrayEquals(expected, result);
    }
}