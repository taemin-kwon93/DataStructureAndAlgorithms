package org.study.parksangkhil;

import java.util.*;

public class InsertionSortList {
    public ListNode insertionSort(ListNode head) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            pq.add(temp);
            head = head.next;
        }

        ListNode sortList = new ListNode(Objects.requireNonNull(pq.poll()).val);
        ListNode root = sortList;
        while (!pq.isEmpty()) {
            sortList.next = pq.poll();
            sortList = sortList.next;
        }

        return root;
    }

    public ListNode insertionSort2(ListNode head) {
        ListNode parent = new ListNode();
        ListNode p = parent;

        while (head != null) {
            while (p.next != null && p.next.val < head.val)
                p = p.next;

            ListNode pNext = p.next;
            ListNode hNext = head.next;

            p.next = head;
            head.next = pNext;
            head = hNext;

            if (head != null && p.val > head.val) {
                p = parent;
            }
         }

        return parent.next;
    }
}
