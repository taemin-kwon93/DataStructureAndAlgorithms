package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {
    private SortList sortList;

    @BeforeEach
    void setUp() {
        sortList = new SortList();
    }

    @Test
    void sortList() {
        ListNode n4 = new ListNode(0);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(5, n2);
        ListNode root = new ListNode(-1, n1);
        ListNode result = sortList.sortList(root);

        assertEquals(-1, result.val);
        assertEquals(0, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }
}