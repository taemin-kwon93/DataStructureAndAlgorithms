package org.study.algorithm;

public class ChangeToLowerCase {
    public static void main(String[] args) {
        String answer = solution("SomeText");
        System.out.println(answer);
    }

    private static String solution(String myString) {
        return myString.toLowerCase();
    }
}
