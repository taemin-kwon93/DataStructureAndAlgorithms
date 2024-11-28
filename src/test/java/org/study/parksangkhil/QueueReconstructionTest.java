package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueReconstructionTest {
    private QueueReconstruction queueReconstruction;

    @BeforeEach
    void setUp() {
        queueReconstruction = new QueueReconstruction();
    }

    @Test
    void solution() {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] expected = {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};

        int[][] result = queueReconstruction.reconstructQueue(people);

        assertArrayEquals(expected, result);
    }
}