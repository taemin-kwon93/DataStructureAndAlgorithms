package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryTest {
    private AlienDictionary alienDictionary;

    @BeforeEach
    void setUp() {
        alienDictionary = new AlienDictionary();
    }

    @Test
    void shouldReturnNumberOneWhenDictHaveSpell() {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        int result = alienDictionary.solution(spell, dic);
        System.out.println(result);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnNumberTwoWhenDictDontHaveSpell() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        int result = alienDictionary.solution(spell, dic);
        System.out.println(result);

        assertEquals(2, result);
    }
}
