package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathTest {
    private ShortestPath shortestPath;

    @BeforeEach
    void setUp() {
        shortestPath = new ShortestPath();
    }

    @Test
    void solution() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };
        int expected = 11;

        int result = shortestPath.solution(maps);

        assertEquals(expected, result);
    }
}