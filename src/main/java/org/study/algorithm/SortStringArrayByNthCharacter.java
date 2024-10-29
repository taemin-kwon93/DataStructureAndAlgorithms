package org.study.algorithm;

import java.util.*;

public class SortStringArrayByNthCharacter {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparingInt((String s) -> s.charAt(n)).thenComparing(s -> s))
                .toArray(String[]::new);
    }
}

