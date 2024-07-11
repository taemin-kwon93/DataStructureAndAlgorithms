package org.study.parksangkhil;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    // 내 방식대로 처음 풀어본 stack 문제
    public boolean isValid(String s) {
        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) return false;

        Deque<String> dq = new ArrayDeque<>();
        for (String tmp : s.split("")) {
            if (tmp.equals("(") || tmp.equals("[") || tmp.equals("{")) {
                dq.push(tmp);
            } else if (tmp.equals(")") || tmp.equals("]") || tmp.equals("}")) {
                switch (tmp) {
                    case ")" -> tmp = "(";
                    case "]" -> tmp = "[";
                    case "}" -> tmp = "{";
                }

                try {
                    if (dq.getFirst().equals(tmp)) {
                        dq.pop();
                    } else {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }

        return dq.isEmpty();
    }
}
