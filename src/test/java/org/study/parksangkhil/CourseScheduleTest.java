package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {
    private CourseSchedule courseSchedule;

    @BeforeEach
    void setUp() {
        courseSchedule = new CourseSchedule();
    }

    @Test
    void canFinish() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {2, 1}};

        boolean result = courseSchedule.canFinish(numCourses, prerequisites);

        assertTrue(result);
    }
}