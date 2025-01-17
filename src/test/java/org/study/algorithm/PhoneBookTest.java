package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    void solution() {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};
        String[] phone_book4 = {"123", "12", "567","88"};

        boolean result1 = phoneBook.solution(phone_book1);
        boolean result2 = phoneBook.solution(phone_book2);
        boolean result3 = phoneBook.solution(phone_book3);
        boolean result4 = phoneBook.solution(phone_book4);

        assertFalse(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
    }
}