package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandTest {
    private NumberOfIsland numOfIsland;

    @BeforeEach
    void setUp() {
        numOfIsland = new NumberOfIsland();
    }

    @Test
    void numIsland() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','1'}};
        int expected = 2;

        int result = numOfIsland.numIslands(grid);

        assertEquals(expected, result);
    }
}