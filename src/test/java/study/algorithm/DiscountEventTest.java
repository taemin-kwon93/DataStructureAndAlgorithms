package study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.study.algorithm.DiscountEvent;

public class DiscountEventTest {

    private DiscountEvent discountEvent;

    @BeforeEach
    void setUp() {
        discountEvent = new DiscountEvent();
    }

    @Test
    void validatePricce() {
        int price = 150000;
        int discountedPrice = 142500;

        int result = discountEvent.solution(price);
        assertEquals(discountedPrice, result);
    }
}
