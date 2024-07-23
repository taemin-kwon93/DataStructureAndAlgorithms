package org.study.parksangkhil;



public class ReversLinkedListII {
    public ListNode solution(ListNode head, int start, int end) {
        if (head == null || start >= end) {
            return head;
        }

        // 더미 노드를 사용하여 간편하게 처리
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // start 위치까지 이동
        for (int i = 0; i < start - 1; i++) {
            if (prev == null) {
                return head; // start가 리스트 길이를 넘는 경우
            }
            prev = prev.next;
        }

        // 역순 정렬 시작점 설정
        ListNode reverseStart = prev.next;
        ListNode current = reverseStart;
        ListNode next;
        ListNode switchedNode = null;

        // 부분 리스트를 역순으로 변환
        for (int i = 0; i <= end - start; i++) {
            if (current == null) {
                return head; // end가 리스트 길이를 넘는 경우
            }
            next = current.next;
            current.next = switchedNode;
            switchedNode = current;
            current = next;
        }

        // 역순 정렬된 리스트와 나머지 리스트 연결
        prev.next = switchedNode;
        reverseStart.next = current;

        return dummy.next;
    }
}
