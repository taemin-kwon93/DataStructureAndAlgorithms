package org.study.algorithm;

public class SubstringExtractor2 {
    public int solution(String my_string, String is_suffix) {
        return (my_string.endsWith(is_suffix)) ? 1 : 0;
    }
}