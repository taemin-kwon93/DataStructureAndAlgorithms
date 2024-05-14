package study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.study.algorithm.SubstringExtractor;

public class SubstringExtractorTest {
    private SubstringExtractor subStrExtractor;

    @BeforeEach
    void setUp() { subStrExtractor = new SubstringExtractor(); }

    @Test
    void validateSolution() {
        String my_string = "ProgrammerS123";
        int n = 11;

        String answer = subStrExtractor.solution(my_string, n);
        assertEquals("ProgrammerS", answer);
    }

    @Test
    void validateSolution2() {
        String my_string = "He110W0r1d";
        int n = 5;

        String answer = subStrExtractor.solution2(my_string, n);
        assertEquals("He110", answer);
    }
}
