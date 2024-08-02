package org.study.parksangkhil;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public int solution(String s, String j) {
        int answer = 0;
        char[] chars = s.toCharArray();
        char[] jewels = j.toCharArray();

        for (char c : chars) {
            for (char c2 : jewels) {
                if (c == c2) answer ++;
            }
        }

        return answer;
    }

    public int solutionB(String s, String j) {
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;

        char[] jewels = j.toCharArray();
        for (char jewel : jewels) map.put(jewel, map.getOrDefault(jewel, 0) + 1);

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) answer++;
        }

        return answer;
    }
}
