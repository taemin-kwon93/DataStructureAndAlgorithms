package study.algorithm;

import org.junit.jupiter.api.Test;
import org.study.algorithm.PrefixChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixCheckerTest {

    @Test
    void validatePrefix_WhenPrefixExists_Returns1() {
        // Given
        PrefixChecker preCheck = new PrefixChecker();

        // When
        int result = preCheck.solution("banana", "ban");

        // Then
        assertEquals(1, result);
    }

    @Test
    void validatePrefix_WhenPrefixNotExists_Returns0() {
        // Given
        PrefixChecker preCheck = new PrefixChecker();

        // When
        int result = preCheck.solution("pole", "app");

        // Then
        assertEquals(0, result);
    }
}
