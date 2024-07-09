package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandPaintingTest {
    private ExpandPainting expandPainting;

    @BeforeEach
    void setUp() {
        expandPainting = new ExpandPainting();
    }

    @Test
    void solution() {
        String[] picture = {
                ".xx...xx.",
                "x..x.x..x",
                "x...x...x",
                ".x.....x.",
                "..x...x..",
                "...x.x...",
                "....x...."
        };

        String[] expected = {
                "..xxxx......xxxx..",
                "..xxxx......xxxx..",
                "xx....xx..xx....xx",
                "xx....xx..xx....xx",
                "xx......xx......xx",
                "xx......xx......xx",
                "..xx..........xx..",
                "..xx..........xx..",
                "....xx......xx....",
                "....xx......xx....",
                "......xx..xx......",
                "......xx..xx......",
                "........xx........",
                "........xx........"
        };

        String[] result = expandPainting.solution(picture, 2);

        assertArrayEquals(expected, result);
    }

    @Test
    void expandPic() {
        String s = ".xx...xx.";
        String expected = "..xxxx......xxxx..";

        String result = expandPainting.expandPic(s, 2);

        assertEquals(expected, result);
    }
}