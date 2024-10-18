package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortListTest {
    private InsertionSortList isl;

    @BeforeEach
    void setUp() {
        isl = new InsertionSortList();
    }

    @Test
    void insertionSort() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode root = new ListNode(4, node1);

        ListNode result = isl.insertionSort(root);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
    }

    @Test
    void insertionSort2() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode root = new ListNode(4, node1);

        ListNode result = isl.insertionSort2(root);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
    }
}