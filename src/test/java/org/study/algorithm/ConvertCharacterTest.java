package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertCharacterTest {
    private ConvertCharacter convertCharacter;

    @BeforeEach
    void setUp() {
        convertCharacter = new ConvertCharacter();
    }

    @Test
    void solution() {
        String result = convertCharacter.solution("masterpiece");
        System.out.println(result);
    }
}