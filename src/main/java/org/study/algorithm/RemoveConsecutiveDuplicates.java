package org.study.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveConsecutiveDuplicates {
    public int[] solution(int[] arr) {
        // prevent exception
        if (arr == null || arr.length == 0) return new int[] {};

        Deque<Integer> deque = new LinkedList<>();
        deque.add(arr[0]);

        for (int i : arr) {
            if (deque.getLast() != i) deque.add(i);
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
