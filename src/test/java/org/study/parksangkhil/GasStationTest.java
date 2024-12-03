package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    private GasStation gasStation;

    @BeforeEach
    void setUp() {
        gasStation = new GasStation();
    }

    @Test
    void canCompleteCircuit() {
        int[] gas1 = {5, 1, 2, 3, 4};
        int[] cost1 = {4, 4, 1, 5, 1};

        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};

        int[] gas3 = {5};
        int[] cost3 = {4};

        int result1 = gasStation.canCompleteCircuit(gas1, cost1);
        int result2 = gasStation.canCompleteCircuit(gas2, cost2);
        int result3 = gasStation.canCompleteCircuit(gas3, cost3);

        assertEquals(4, result1);
        assertEquals(-1, result2);
        assertEquals(0, result3);
    }

    @Test
    void canCompleteCircuit2() {
        int[] gas1 = {5, 1, 2, 3, 4};
        int[] cost1 = {4, 4, 1, 5, 1};

        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};

        int[] gas3 = {5};
        int[] cost3 = {4};

        int result1 = gasStation.canCompleteCircuit2(gas1, cost1);
        int result2 = gasStation.canCompleteCircuit2(gas2, cost2);
        int result3 = gasStation.canCompleteCircuit2(gas3, cost3);

        assertEquals(4, result1);
        assertEquals(-1, result2);
        assertEquals(0, result3);
    }
}