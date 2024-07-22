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

    // ListNode의 순서를 교환하는것이 아닌, Node의 값만 변경함
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

    // ListNode 순서 수정
    public ListNode swapPairsB(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        // head Node와 그 다음 node가 교환되므로 next가 root가 됨.
        ListNode root = head.next;
        // node의 첫번째 교환을 위한 임시 노드를 생성. 이후 해당 node는 포인터와 같은 역할을 함
        ListNode node = new ListNode(0);
        // (0, 임시노드) -> 1 -> 2 -> 3 -> ...생략
        node.next = head;

        while (node.next != null && node.next.next != null) {
            // {{0}임시, {1}, {2}, {3}, {4}}
            // {{1}, {2}} 두개의 노드를 왼쪽과 오른쪽으로 구분했을 때 서로 교환해야 함. {{2}, {1}}
            ListNode leftNode = node.next;
            ListNode rightNode = node.next.next;
            node.next = rightNode;
            leftNode.next = rightNode.next;
            rightNode.next = leftNode;

            node = node.next.next;
        }
        return root;
    }
}
