package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeirdStringConverterTest {
    private WeirdStringConverter weirdStringConverter;

    @BeforeEach
    void setUp() {
        weirdStringConverter = new WeirdStringConverter();
    }

    @ParameterizedTest
    @CsvSource({
            "'try hello world','TrY HeLlO WoRlD'",
            "'abadef','AbAdEf'",
            "'is good thing','Is GoOd ThInG'",
            "What's the matter?,WhAt's ThE MaTtEr?",
            "'a b c', 'A B C'",
            "'aaa  ', 'AaA  '"
    })
    void solution(String s, String expected) {
        String result = weirdStringConverter.solution(s);
        assertEquals(expected, result);
    }
}