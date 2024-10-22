package org.study.algorithm;

import java.util.Deque;
import java.util.ArrayDeque;

public class RemoveDuplicatedPair {
    public int solution(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        dq.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!dq.isEmpty() && dq.peek() == c) {
                dq.removeFirst();
            } else {
                dq.push(c);
            }
        }

        return dq.isEmpty() ? 1 : 0;
    }
}
