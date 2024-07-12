package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCoordinateTest {
    private CharacterCoordinate characterCoordinate;

    @BeforeEach
    void setUp() {
        characterCoordinate = new CharacterCoordinate();
    }

    @ParameterizedTest
    @CsvSource({
            "'left,right,up,down', 10,10, 0,0",
            "'left,left,left,left', 10,10, -4,0",
            "'right,right,right,right', 10,10, 4,0",
            "'up,up,up,up', 10,10, 0,4",
            "'down,down,down,down', 10,10, 0,-4",
            "'left,left,up,up', 10,10, -2,2",
            "'right,right,down,down', 10,10, 2,-2",
            "'left,left,left,right,right,right', 10,10, 0,0",
            "'up,up,up,down,down,down', 10,10, 0,0",
            "'right,up,right,down', 10,10, 2,0",
            "'left,left,left,left,left,left', 10,10, -5,0", // beyond limit
            "'up,up,up,up,up,up', 10,10, 0,5", // beyond limit
            "'right,right,right,right,right,left', 9,5, 3,0" // beyond limit

    })
    void solution(String keyinput, int boardX, int boardY, int expectedX, int expectedY) {
        String[] keyinputArray = keyinput.split(",");
        int[] board = {boardX, boardY};
        int[] expected = {expectedX, expectedY};

        int[] result = characterCoordinate.solution(keyinputArray, board);

        assertArrayEquals(expected, result);
    }
}