package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList;
    @BeforeEach
    void setUp() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    void solution() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        boolean b = palindromeLinkedList.solution(list);

        assertTrue(b);
    }
}