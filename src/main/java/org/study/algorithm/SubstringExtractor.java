package org.study.algorithm;

public class SubstringExtractor {
    public String solution(String my_string, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += my_string.charAt(i);
        }

        return result;
    }

    public String solution2(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
