package org.study.parksangkhil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class LongestSubstring {
    // 완료되지 않은 풀이.
    public int solution(String s) {
        Set<Character> setLimit = new HashSet<>();

        for (char c : s.toCharArray()) {
            setLimit.add(c);
        }

        int max = 0;
        int limit = setLimit.size();
        int pl, pr;

        for (int i = 0; i < s.length() - 2; i++) {
            pl = i;
            pr = i + 2;
            String sub = " ";
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));

            while (set.size() == sub.length()) {
                sub = s.substring(pl, pr);
                set.add(s.charAt(pr++));
                max = Math.max(set.size(), max);
                if (max == limit) break;
            }
        }

        return max;
    }

    public int solutionB(String s) {
        Map<Character, Integer> used = new HashMap<>();
        int maxLength = 0;
        int left = 0, right = 0;

        for (char c : s.toCharArray()) {
            if (used.containsKey(c) && left <= used.get(c)) {
                left = used.get(c) + 1;
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            used.put(c, right);
            right++;
        }

        return maxLength;
    }
}
