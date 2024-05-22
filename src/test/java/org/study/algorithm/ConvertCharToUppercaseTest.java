package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertCharToUppercaseTest {
    private ConvertCharToUppercase convertCharToUppercase;
    @BeforeEach
    void setUp() {
        convertCharToUppercase = new ConvertCharToUppercase();
    }

    @Test
    void solution() {
        String result = convertCharToUppercase.solution("programmers", "p");
        assertEquals("Programmers", result);
    }

}