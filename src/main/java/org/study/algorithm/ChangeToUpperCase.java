package org.study.algorithm;

public class ChangeToUpperCase {
    public static void main(String[] args) {
        String answer = solution("SomeText");
        System.out.println(answer);
    }

    public static String solution(String myString) {
        return myString.toUpperCase();
    }
}
