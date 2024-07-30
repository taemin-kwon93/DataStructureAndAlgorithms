package org.study.parksangkhil;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 */

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode dummy = new ListNode(0);  // 더미 노드
        ListNode current = dummy;
        boolean isDone;

        do {
            int i = 0;
            int ptr = -1;
            int min = Integer.MAX_VALUE;
            int nullCounter = 0;

            for (; i < k; i++) {
                if (lists[i] != null) {
                    if (min > lists[i].val) {
                        min = lists[i].val;
                        ptr = i;
                    }
                } else {
                    nullCounter++;
                }
            }

            isDone = nullCounter == k;

            if (ptr != -1) {
                current.next = new ListNode(min);
                current = current.next;
                lists[ptr] = lists[ptr].next;
            }

        } while (!isDone);

        return dummy.next;
    }

    public ListNode mergeKListsB(ListNode[] lists) {
        // lists에 있는 node들의 value를 비교하는 우선순위 큐
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

        ListNode root = new ListNode(0);
        ListNode tail = root;

        // 각 연결 리스트의 첫 번째 노드를 큐에 저장
        for (ListNode node : lists) {
            if (node != null) pq.add(node);
        }

        // 큐가 모두 빌 때까지 반복
        while (!pq.isEmpty()) {
            // 우선순위에 따라 추출, 다음 노드로 이동
            tail.next = pq.poll();
            tail = tail.next;

            // 추출한 연결 리스트의 다음 노드는 다시 큐에 저장
            if (tail.next != null) pq.add(tail.next);
        }

        return root.next;
    }
}

/* 처음 문제를 풀 때 시도한 방법
 * public ListNode mergeKLists(ListNode[] lists) {
 *         int k = lists.length;
 *         ListNode node = new ListNode(0);
 *         ListNode head = node;
 *         boolean isDone = false;
 *         do {
 *             int i = 0; // 각 노드를 순회할 때 인덱스로 사용할 변수
 *             int ptr = 0; // 가장 작은값을 가지고 있는 노드의 인덱스
 *             int min = 10000; // 문제에서의 제약 조건인 수의 크기 10 ^ 4
 *             int nullCounter = 0;
 *             for (; i < k; i++) {
 *                 if (lists[i] != null) {
 *                     if (min > lists[i].val) {
 *                         // 가장 작은 수 판별 및 값 대입
 *                         min = lists[i].val;
 *                         ptr = i;
 *                     }
 *                 } else {
 *                     nullCounter++;
 *                     // lists에 담겨있는 node를 순회하는 중 해당 node가 null이 된 경우를 셈
 *                     // 모든 node가 null이 되면 isDone을 true로 대입
 *                     isDone = nullCounter == k;
 *                 }
 *             }
 *             // for문 순회 중 가장 작은수를 가지고 있던 node를 다음으로 넘김
 *             if (lists[ptr] != null) {
 *                 lists[ptr] = lists[ptr].next;
 *             }
 *             // 가장 작은 값을 새로운 node로 생성한 후 답변이 될 node에 이어붙임
 *             node.next = new ListNode(min);
 *             node = node.next;
 *         } while (!isDone);
 *         return head.next;
 *     }
 */