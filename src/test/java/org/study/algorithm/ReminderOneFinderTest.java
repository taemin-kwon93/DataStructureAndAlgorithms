package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReminderOneFinderTest {
    private ReminderOneFinder reminderOneFinder;

    @BeforeEach
    void setUp() {
        reminderOneFinder = new ReminderOneFinder();
    }

    @Test
    void solution() {
        int result = reminderOneFinder.solution(10);
        System.out.println(result);
    }
}