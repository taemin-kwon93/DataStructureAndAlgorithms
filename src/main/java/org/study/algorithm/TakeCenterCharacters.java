package org.study.algorithm;

public class TakeCenterCharacters {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        if (s.isEmpty()) return "";
        if (s.length() == 1) return s;

        String a = String.valueOf(s.charAt((s.length() / 2) - 1));
        String b = String.valueOf(s.charAt((s.length() / 2)));
        sb = (s.length() % 2 == 0) ? sb.append(a).append(b) : sb.append(b);

        return sb.toString();
    }
}
