package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderLogFilesLambdaVersionTest {
    private ReorderLogFilesLambdaVersion reorderLogFilesLambdaVersion;

    @BeforeEach
    void setUp() {
        reorderLogFilesLambdaVersion = new ReorderLogFilesLambdaVersion();
    }

    @Test
    void solution() {
        String[] strArr = {"id1 8 1 5 2", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"};
        String[] expected = {"id2 art can", "id5 art zero", "id4 own kit dig", "id1 8 1 5 2", "id3 3 6"};

        String[] result = reorderLogFilesLambdaVersion.solution(strArr);

        assertArrayEquals(expected, result);
    }
}