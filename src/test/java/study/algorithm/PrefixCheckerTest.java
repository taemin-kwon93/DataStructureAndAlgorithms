package study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.study.algorithm.PrefixChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixCheckerTest {

    private PrefixChecker preCheck;

    @BeforeEach
    void setUp() {
        preCheck = new PrefixChecker();
    }

    @Test
    void validatePrefix_WhenPrefixExists_Returns1() {
        int result = preCheck.solution("banana", "ban");
        assertEquals(1, result);
    }

    @Test
    void validatePrefix_WhenPrefixNotExists_Returns0() {
        int result = preCheck.solution("pole", "app");
        assertEquals(0, result);
    }

    @Test
    void validatePrefix_Solution2_Returns1() {
        int result = preCheck.solution2("banana", "ban");
        assertEquals(1, result);
    }

    @Test
    void validatePrefix_Solution2_Returns2() {
        int result = preCheck.solution2("pole", "app");
        assertEquals(0, result);
    }
}
