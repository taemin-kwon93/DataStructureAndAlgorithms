package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HidePhoneNumberTest {
    private HidePhoneNumber hidePhoneNumber;

    @BeforeEach
    void setUp() {
        hidePhoneNumber = new HidePhoneNumber();
    }

    @Test
    void solution() {
        String phone_number = "01033334444";

        String result = hidePhoneNumber.solution(phone_number);

        assertEquals("*******4444", result);
    }

    @Test
    void solution2() {
        String phone_number = "01033334444";

        String result = hidePhoneNumber.solution2(phone_number);

        assertEquals("*******4444", result);
    }
}