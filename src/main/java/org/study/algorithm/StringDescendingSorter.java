package org.study.algorithm;

import java.util.Arrays;

public class StringDescendingSorter {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - i- 1];
            chars[chars.length - i - 1] = tmp;
        }
        return new String(chars);
    }
}
