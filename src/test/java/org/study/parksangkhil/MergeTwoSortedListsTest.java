package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    void solution() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5));

        List<Integer> result = mergeTwoSortedLists.solution(list1, list2);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void mergeTwoSortedLists() {
        ListNode nodeA1 = new ListNode(4);
        ListNode nodeA2 = new ListNode(3, nodeA1);
        ListNode nodeA3 = new ListNode(1, nodeA2);

        ListNode nodeB1 = new ListNode(5);
        ListNode nodeB2 = new ListNode(2, nodeB1);
        ListNode nodeB3 = new ListNode(1, nodeB2);

        ListNode result = mergeTwoSortedLists.mergeTwoLists(nodeA3, nodeB3);

        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
    }

    @Test
    void recursionSolution() {
        ListNode nodeA1 = new ListNode(4);
        ListNode nodeA2 = new ListNode(3, nodeA1);
        ListNode nodeA3 = new ListNode(1, nodeA2);

        ListNode nodeB1 = new ListNode(5);
        ListNode nodeB2 = new ListNode(2, nodeB1);
        ListNode nodeB3 = new ListNode(1, nodeB2);

        ListNode result = mergeTwoSortedLists.recursionSolution(nodeA3, nodeB3);

        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
    }
}