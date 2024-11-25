package org.study.parksangkhil;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatCharacter {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0, maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);

            // Update the max frequency of any character in the current window
            maxFreq = Math.max(maxFreq, freqMap.get(currentChar));

            // If the remaining characters (window size - maxFreq) exceed k, shrink the window
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                left++;
            }

            // Update the maximum length of the valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    /**
     * 처음에 접근했던 풀이방법
     */
    public int charReplacement(String s, int k) {
        int repeat, maxLen = 0;
        int fix;
        int left, right;
        int ruler;

        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = left;
            ruler = 0;
            fix = 0;
            repeat = k;
            while (right < s.length() && repeat > -1) {
                if (s.charAt(left) != s.charAt(right)) {
                    repeat -= 1;
                    fix++;
                } else if (s.charAt(left) == s.charAt(right)) {
                    ruler++;
                }
                right++;
            }
            maxLen = Math.max(maxLen, ruler + fix);
        }

        return maxLen;
    }
}