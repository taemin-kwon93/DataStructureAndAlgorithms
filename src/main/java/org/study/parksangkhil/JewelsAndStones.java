package org.study.parksangkhil;

public class JewelsAndStones {
    public int solution(String s, String j) {
        int answer = 0;
        char[] chars = s.toCharArray();
        char[] jewels = j.toCharArray();

        for (char c : chars) {
            for (char c2 : jewels) {
                if (c == c2) answer ++;
            }
        }

        return answer;
    }
}
