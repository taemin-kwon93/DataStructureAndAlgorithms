package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @ParameterizedTest
    @CsvSource({
            "'()', true",
            "'()[]{}', true",
            "'(]', false",
            "'([)]', false",
            "'{[]}', true",
            "'', true",
            "'[', false",
            "'}}', false"
    })
    void isValid(String input, boolean expected) {
        boolean result = validParentheses.isValid(input);
        assertEquals(expected, result);
    }
}