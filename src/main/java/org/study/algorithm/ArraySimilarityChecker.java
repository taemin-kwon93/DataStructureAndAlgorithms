package org.study.algorithm;

public class ArraySimilarityChecker {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                answer = (s1[i] == s2[j])? ++answer : answer;
            }
        }
        return answer;
    }

    public int solution2(String[] s1, String[] s2) {
        int answer = 0;
        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
