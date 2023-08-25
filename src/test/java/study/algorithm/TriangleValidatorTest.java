package study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.study.algorithm.TriangleValidator2;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleValidatorTest {

    private TriangleValidator2 validator2;

    @BeforeEach
    void setUp() {
        validator2 = new TriangleValidator2();
    }

    @Test
    void validateScaleneTriangle() {
        int[] sides = {3, 4, 5};

        int result = validator2.solution(sides);

        assertEquals(1, result);
    }

    @Test
    void validateIsoscelesTriangle() {
        int[] sides = {3, 5, 5};

        int result = validator2.solution(sides);

        assertEquals(1, result);
    }

    @Test
    void validateEquilateralTriangle() {
        int[] sides = {5, 5, 5};

        int result = validator2.solution(sides);

        assertEquals(1, result);
    }
}
