package org.study.algorithm;

public class QrCode {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) sb.append(code.charAt(i));
        }
        System.out.println(sb);
        return sb.toString();
    }
}
