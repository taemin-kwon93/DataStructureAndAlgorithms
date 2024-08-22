package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTicketTest {
    private FlightTicket flightTicket;
    @BeforeEach
    void setUp() {
        flightTicket = new FlightTicket();
    }

    @Test
    void solution() {
        String[][] tickets = {
                {"ICN", "SFO"},
                {"ICN", "ATL"},
                {"SFO", "ATL"},
                {"ATL", "ICN"},
                {"ATL", "SFO"}
        };
        String[] expected = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

        String[] result = flightTicket.solution(tickets);

        assertArrayEquals(expected, result);
    }
}