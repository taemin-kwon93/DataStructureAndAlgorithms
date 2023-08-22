package study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    private Letter letter;

    @BeforeEach
    void setUp() {
        letter = new Letter();
    }

    @Test
    void calculateWidth_withGivenMessage_returnsCorrectWidth() {
        // Given
        String message = "happy birthday!";

        // When
        int result = letter.calculateWidth(message);

        // Then
        assertEquals(30, result); // "happy birthday!" has 15 characters, so 15*2 = 30
    }

    @Test
    void calculateWidth_withEmptyMessage_returnsZero() {
        // Given
        String message = "";

        // When
        int result = letter.calculateWidth(message);

        // Then
        assertEquals(0, result); // Empty string has 0 characters
    }
}