package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    private SwapNodesInPairs swapNodesInPairs;

    @BeforeEach
    void setUp() {
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @Test
    void solution() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 6, 5));

        List<Integer> result = swapNodesInPairs.solution(list);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void swapPairs() {
        ListNode tail = new ListNode(6);
        ListNode ln5 = new ListNode(5, tail);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode head = new ListNode(1, ln2);

        ListNode result = swapNodesInPairs.swapPairs(head);

        // 초기값: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 기대값: 2 -> 1 -> 4 -> 3 -> 6 -> 5
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(6, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
    }

    @Test
    void swapPairsB() {
        ListNode tail = new ListNode(6);
        ListNode ln5 = new ListNode(5, tail);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode head = new ListNode(1, ln2);

        ListNode result = swapNodesInPairs.swapPairsB(head);

        // 초기값: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 기대값: 2 -> 1 -> 4 -> 3 -> 6 -> 5
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(6, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
    }
}