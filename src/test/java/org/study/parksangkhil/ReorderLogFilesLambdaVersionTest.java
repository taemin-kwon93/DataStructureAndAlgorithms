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
        String[] logs1 = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] logs2 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] expected1 = {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
        String[] expected2 = {"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};

        String[] result1 = reorderLogFilesLambdaVersion.solution(logs1);
        String[] result2 = reorderLogFilesLambdaVersion.solution(logs2);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
    }
}