package org.study.algorithm;

import java.util.*;

public class MoveTheParentheses {
    public int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i) + s.substring(0, i);
            if (isValidParentheses(tmp)) count++;
        }
        return count;
    }

    public boolean isValidParentheses(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        char c = s.charAt(0);
        if (c == ')' || c == '}' || c == ']')
            return false;

        for (char x : s.toCharArray()) {
            if (x != ')' && x != '}' && x != ']') {
                dq.push(x);
            } else {
                char tmp = 0;
                if (!dq.isEmpty()) {
                    tmp = dq.peek();
                }
                switch (tmp) {
                    case '(' -> {
                        if (x == ')') {
                            dq.pop();
                        } else {
                            return false;
                        }
                    }
                    case '{' -> {
                        if (x == '}') {
                            dq.pop();
                        } else {
                            return false;
                        }
                    }
                    case '[' -> {
                        if (x == ']') {
                            dq.pop();
                        } else {
                            return false;
                        }
                    }
                    default -> {
                        return false;
                    }
                }
            }
        }

        return dq.isEmpty();
    }
}
