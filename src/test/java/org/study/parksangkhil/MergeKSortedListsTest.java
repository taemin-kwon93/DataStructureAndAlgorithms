package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {
    private MergeKSortedLists mergeKSortedLists;

    @BeforeEach
    void setUp() {
        mergeKSortedLists = new MergeKSortedLists();
    }

    // 리스트를 ListNode로 변환
    private ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // ListNode를 리스트로 변환
    private int[] listToArray(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] arr = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            arr[i] = current.val;
            current = current.next;
        }
        return arr;
    }

    @Test
    public void testMergeKLists() {
        // 테스트 케이스 1: 정상적인 병합
        ListNode[] lists1 = new ListNode[]{
                arrayToList(new int[]{1, 4, 5}),
                arrayToList(new int[]{1, 3, 4}),
                arrayToList(new int[]{2, 6})
        };
        ListNode result1 = mergeKSortedLists.mergeKLists(lists1);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, listToArray(result1));

        // 테스트 케이스 2: 비어있는 리스트들
        ListNode[] lists2 = new ListNode[]{
                arrayToList(new int[]{}),
                arrayToList(new int[]{}),
                arrayToList(new int[]{})
        };
        ListNode result2 = mergeKSortedLists.mergeKLists(lists2);
        assertNull(result2);

        // 테스트 케이스 3: 한 리스트만 존재하는 경우
        ListNode[] lists3 = new ListNode[]{
                arrayToList(new int[]{1, 3, 5})
        };
        ListNode result3 = mergeKSortedLists.mergeKLists(lists3);
        assertArrayEquals(new int[]{1, 3, 5}, listToArray(result3));

        // 테스트 케이스 4: 다양한 크기의 리스트들
        ListNode[] lists4 = new ListNode[]{
                arrayToList(new int[]{2}),
                arrayToList(new int[]{1, 3}),
                arrayToList(new int[]{4, 5, 6}),
                arrayToList(new int[]{})
        };
        ListNode result4 = mergeKSortedLists.mergeKLists(lists4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, listToArray(result4));
    }

    @Test
    public void testMergeKListsB() {
        // 테스트 케이스 1: 정상적인 병합
        ListNode[] lists1 = new ListNode[]{
                arrayToList(new int[]{1, 4, 5}),
                arrayToList(new int[]{1, 3, 4}),
                arrayToList(new int[]{2, 6})
        };
        ListNode result1 = mergeKSortedLists.mergeKListsB(lists1);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, listToArray(result1));

        // 테스트 케이스 2: 비어있는 리스트들
        ListNode[] lists2 = new ListNode[]{
                arrayToList(new int[]{}),
                arrayToList(new int[]{}),
                arrayToList(new int[]{})
        };
        ListNode result2 = mergeKSortedLists.mergeKListsB(lists2);
        assertNull(result2);

        // 테스트 케이스 3: 한 리스트만 존재하는 경우
        ListNode[] lists3 = new ListNode[]{
                arrayToList(new int[]{1, 3, 5})
        };
        ListNode result3 = mergeKSortedLists.mergeKListsB(lists3);
        assertArrayEquals(new int[]{1, 3, 5}, listToArray(result3));

        // 테스트 케이스 4: 다양한 크기의 리스트들
        ListNode[] lists4 = new ListNode[]{
                arrayToList(new int[]{2}),
                arrayToList(new int[]{1, 3}),
                arrayToList(new int[]{4, 5, 6}),
                arrayToList(new int[]{})
        };
        ListNode result4 = mergeKSortedLists.mergeKListsB(lists4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, listToArray(result4));
    }
}