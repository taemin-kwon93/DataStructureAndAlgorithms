package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {
    private Tournament tournament;

    @BeforeEach
    void setUp() {
        tournament = new Tournament();
    }

    @Test
    void solution() {
        int result = tournament.solution(128, 54, 73);
        assertEquals(7, result);
    }

    @Test
    void solution2() {
        int result = tournament.solution2(54, 73);
        assertEquals(7, result);
    }
}