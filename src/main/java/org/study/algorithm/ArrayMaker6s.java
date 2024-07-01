package org.study.algorithm;

import java.util.Stack;

public class ArrayMaker6s {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.lastElement() == arr[i]) {
                stk.remove(stk.lastElement());
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        return (stk.isEmpty()) ? new int[] {-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
