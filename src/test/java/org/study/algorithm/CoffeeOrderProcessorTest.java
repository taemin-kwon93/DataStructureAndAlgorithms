package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderProcessorTest {
    private CoffeeOrderProcessor coffeeOrderProcessor;

    @BeforeEach
    void setUp() {
        coffeeOrderProcessor = new CoffeeOrderProcessor();
    }

    @Test
    void solution() {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        int result = coffeeOrderProcessor.solution(order);

        assertEquals(19000, result);
    }
}