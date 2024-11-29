package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {
    private TaskScheduler taskScheduler;

    @BeforeEach
    void setUp() {
        taskScheduler = new TaskScheduler();
    }

    @Test
    void leastInterval() {
        char[] tasks1 = {'A','C','A','B','D','B'};
        char[] tasks2 = {'A','A','A', 'B','B','B'};
        char[] tasks3 = {'A','B','C','D','E','A','B','C','D','E'};
        char[] tasks4 = {'A','A','A','B','B','B', 'C','C','C', 'D', 'D', 'E'};
        char[] tasks5 = {'A', 'A', 'A'};

        int result1 = taskScheduler.leastInterval(tasks1, 1);
        int result2 = taskScheduler.leastInterval(tasks2, 3);
        int result3 = taskScheduler.leastInterval(tasks3, 4);
        int result4 = taskScheduler.leastInterval(tasks4, 2);
        int result5 = taskScheduler.leastInterval(tasks5, 1);

        assertEquals(6, result1);
        assertEquals(10, result2);
        assertEquals(10, result3);
        assertEquals(12, result4);
        assertEquals(5, result5);
    }
}