package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {
    private OddEvenLinkedList oddEvenLinkedList;

    @BeforeEach
    void setUp() {
        oddEvenLinkedList = new OddEvenLinkedList();
    }

    @Test
    void solution() {
        ListNode l6 = new ListNode(6);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode head = new ListNode(1, l2);

        ListNode result = oddEvenLinkedList.solution(head);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(6, result.next.next.next.next.next.val);
    }
}