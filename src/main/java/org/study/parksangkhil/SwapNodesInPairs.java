package org.study.parksangkhil;

import java.util.List;

public class SwapNodesInPairs {
    public List<Integer> solution(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i+=2) {
            int tmp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, tmp);
        }
        return list;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            // 임시 변수를 이용해 값만 교환
            int tmp;
            tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;

            // 두 칸 앞으로 이동
            node = node.next.next;
        }

        return head;
    }
}
