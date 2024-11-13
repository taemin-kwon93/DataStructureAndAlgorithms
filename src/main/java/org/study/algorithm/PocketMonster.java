package org.study.algorithm;

import java.util.*;

public class PocketMonster {
    public int solution(int[] nums) {
        int remainder = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            set.add(i);

        int answer = 0;
        while (answer < remainder && answer < set.size())
            answer++;

        return answer;
    }
}
