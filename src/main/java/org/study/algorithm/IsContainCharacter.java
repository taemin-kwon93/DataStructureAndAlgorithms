package org.study.algorithm;

import java.util.Arrays;

public class IsContainCharacter {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return (int) chars[chars.length - 1] < 58 && 47 < (int) chars[0];
    }
}
