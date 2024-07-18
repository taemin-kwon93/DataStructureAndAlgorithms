package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;

public class MergeTwoSortedLists {
    public List<Integer> solution(List<Integer> list1, List<Integer> list2) {
        List<Integer> answer = new ArrayList<>(list1);
        answer.addAll(list2);

        return answer.stream().sorted().toList();
    }

    // while 문을 이용한 풀이
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer;
        ListNode answerB;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if (list1.val > list2.val) {
            answer = list2;
            list2 = list2.next;
        } else {
            answer = list1;
            list1 = list1.next;
        }

        answerB = answer;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                answer.next = list2;
                list2 = list2.next;
            } else {
                answer.next = list1;
                list1 = list1.next;
            }
            answer = answer.next;
        }

        if (list1 == null) {
            while (list2 != null) {
                answer.next = list2;
                list2 = list2.next;
                answer = answer.next;
            }
        } else {
            while (list1 != null) {
                answer.next = list1;
                list1 = list1.next;
                answer = answer.next;
            }
        }

        return answerB;
    }

    // 재귀를 이용한 풀이 방법
    public ListNode recursionSolution(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // l2가 더 크면 l1에 재귀 호출 결과를 엮고 l1을 리턴
        if (list1.val < list2.val) {
            list1.next = recursionSolution(list1.next, list2);
            return list1;
        } else {
            list2.next = recursionSolution(list1, list2.next);
            return list2;
        }
    }
}
