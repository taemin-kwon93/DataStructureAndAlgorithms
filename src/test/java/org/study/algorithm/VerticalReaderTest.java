package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerticalReaderTest {
    private VerticalReader verticalReader;

    @BeforeEach
    void setUp() {
        verticalReader = new VerticalReader();
    }

    @Test
    void solution() {
        String my_string = "ihrhbakrfpndopljhygc";

        String result = verticalReader.solution(my_string, 4, 2);

        assertEquals("happy", result);
    }
}