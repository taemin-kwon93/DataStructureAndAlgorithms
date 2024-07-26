package org.study.parksangkhil;

import java.util.*;

public class DailyTemperatures {
    /**
     * 오답
     * Expected: [8,1,5,4,3,2,1,1,0,0]
     * Output: [8,1,5,4,0,2,1,1,0,0]
     */
    public int[] solution(int[] temps) {
        // 온도값을 보관하고 반복문에서 비교할 때 사용
        Deque<Integer> stack = new ArrayDeque<>();
        // stack에 저장된 값들을 key로 사용, value에 temps의 인덱스를 저장
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[temps.length];

        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && stack.peek() < temps[i]) {
                int last = i - map.get(stack.peek());
                answer[map.get(stack.pop())] = last;
            }
            stack.push(temps[i]);
            map.put(temps[i], i);
        }

        return answer;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int last = stack.pop();
                result[last] = i - last;
            }
            stack.push(i);
        }

        return result;
    }
}
