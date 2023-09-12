package org.study.algorithm;

public class StringIndexModifier {
    public static void main(String[] args) {
        StringIndexModifier solve = new StringIndexModifier();
        String answer = solve.solution("Test B", 0, 5);
        System.out.println(answer);
    }
    public String solution(String str, int x, int y) {
        StringBuilder answer = new StringBuilder(str);
        answer.setCharAt(x, str.charAt(y));
        answer.setCharAt(y, str.charAt(x));
        return answer.toString();
    }
}
