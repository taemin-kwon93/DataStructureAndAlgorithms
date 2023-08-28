package study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.study.algorithm.HowMuchDoesMUSSEUKHaveMoney;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HowMuchDoesMUSSEUKHaveMoneyTest {
    private HowMuchDoesMUSSEUKHaveMoney haveMoney;

    @BeforeEach
    void setUp() {
        haveMoney = new HowMuchDoesMUSSEUKHaveMoney();
    }

    @Test
    void validate() {
        int[] result = haveMoney.solution(5500);
        int[] assertValue = new int[] {1, 0};
        assertTrue(Arrays.equals(result, assertValue));
    }
}
