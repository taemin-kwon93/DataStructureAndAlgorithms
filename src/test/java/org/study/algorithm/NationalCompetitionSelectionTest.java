package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NationalCompetitionSelectionTest {
    private NationalCompetitionSelection nationalCompetitionSelection;

    @BeforeEach
    void setUp() {
        nationalCompetitionSelection = new NationalCompetitionSelection();
    }

    @ParameterizedTest
    @CsvSource({
            "'3,7,2,5,4,6,1', 'false,true,true,true,true,false,false', 20403",
            "'1,2,3', 'true,true,true', 102",
            "'6,1,5,2,3,4', 'true,false,true,false,false,true', 50200"
    })
    void solution(String rankStr, String attendanceStr, int expected) {
        int[] rank = convertStringToIntArray(rankStr);
        boolean[] attendance = convertStringToBooleanArray(attendanceStr);
        int result = nationalCompetitionSelection.solution(rank, attendance);
        assertEquals(expected, result);
    }

    private int[] convertStringToIntArray(String str) {
        String[] split = str.split(",");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        return array;
    }

    private boolean[] convertStringToBooleanArray(String str) {
        String[] split = str.split(",");
        boolean[] array = new boolean[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Boolean.parseBoolean(split[i]);
        }
        return array;
    }
}
