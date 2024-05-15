package study.algorithm;

import org.study.algorithm.SubstringExtractor2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class SubstringExtractor2Test {
    private SubstringExtractor2 subStrExtractor2;

    @BeforeEach
    void setUp() {
        subStrExtractor2 = new SubstringExtractor2();
    }

    @Test
    void validateSolution_WhenSuffixExistsAtEnd_Returns1() {
        // Given
        String a = "banana";
        String b = "ana";

        // When
        int result = subStrExtractor2.solution(a, b);

        // Then
        assertEquals(1, result);
    }

    @Test
    void validateSoultion_WhenSuffixNotEixstsAtEnd_Returns0() {
        // Given
        String a = "banana";
        String b = "abc";

        // When
        int result = subStrExtractor2.solution(a, b);

        // Then
        assertEquals(0, result);

    }
}