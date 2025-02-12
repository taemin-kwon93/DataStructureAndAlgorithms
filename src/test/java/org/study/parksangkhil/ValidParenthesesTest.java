package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    // Common test cases
    static Stream<Arguments> parenthesesTestCases() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("{[]}", true),
                Arguments.of("", true),
                Arguments.of("[", false),
                Arguments.of("}}", false)
        );
    }

    @ParameterizedTest
    @MethodSource("parenthesesTestCases")
    @DisplayName("Test isValid method")
    void testIsValid(String input, boolean expected) {
        assertEquals(expected, validParentheses.isValid(input));
    }

    @ParameterizedTest
    @MethodSource("parenthesesTestCases")
    @DisplayName("Test isValidB method")
    void testIsValidB(String input, boolean expected) {
        assertEquals(expected, validParentheses.isValidB(input));
    }

    @ParameterizedTest
    @MethodSource("parenthesesTestCases")
    @DisplayName("Test isValidC method")
    void testIsValidC(String input, boolean expected) {
        assertEquals(expected, validParentheses.isValidC(input));
    }
}