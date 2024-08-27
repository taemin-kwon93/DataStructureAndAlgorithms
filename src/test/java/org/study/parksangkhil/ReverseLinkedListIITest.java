package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {
    private ReverseLinkedListII reversLinkedListII;

    @BeforeEach
    void setUp() {
        reversLinkedListII = new ReverseLinkedListII();
    }

    @Test
    void reverseBetween() {
        int start = 2;
        int end = 4;

        ListNode ln6 = new ListNode(6);
        ListNode ln5 = new ListNode(5, ln6);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode head = new ListNode(1, ln2);

        ListNode result = reversLinkedListII .solution(head, start, end);

        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
        assertEquals(6, result.next.next.next.next.next.val);
    }
}