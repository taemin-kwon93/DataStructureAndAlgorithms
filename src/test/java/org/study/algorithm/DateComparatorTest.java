package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateComparatorTest {
    private DateComparator dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = new DateComparator();
    }

    @Test
    void solution() {
        int[] date1 = {1023, 12, 28};
        int[] date2 = {1023, 12, 29};
        int result = dateComparator.solution(date1, date2);
        assertEquals(1, result);
    }
}