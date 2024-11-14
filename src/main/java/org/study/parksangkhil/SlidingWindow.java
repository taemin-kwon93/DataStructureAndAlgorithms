 package org.study.parksangkhil;

import java.util.*;

public class SlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.add(i);
            if (i >= k - 1)
                list.add(nums[dq.peek()]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 초기에 접근했던 방법, 미완성 풀이
     */
    public int[] legacyMaxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1) return new int[] {nums[0]};

        Deque<Integer> dq = new ArrayDeque<>();
        int max = 0;
        int[] answer = new int[nums.length - k + 1];

        // 아래 구문은 필요하지 않다.
        // 첫 요소부터 끝까지 순회하며 윈도우 범위에 따라 값을 조정하면 된다.
        for (int i = 0; i < k; i++) {
            max = Math.max(nums[i], max);
            dq.add(max);
        }

        if (!dq.isEmpty())
            answer[0] = dq.peekLast();
        int idx = 1;

        for (int j = k; j < nums.length; j++) {
            max = Math.max(nums[j], dq.removeLast());
            dq.add(max);
            answer[idx++] = max;
        }

        return answer;
    }
}
