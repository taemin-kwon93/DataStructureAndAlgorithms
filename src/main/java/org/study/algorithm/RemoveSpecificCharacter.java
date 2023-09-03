package org.study.algorithm;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        RemoveSpecificCharacter removeSpecificCharacter = new RemoveSpecificCharacter();
        String answer = removeSpecificCharacter.solution("test", "t");
        System.out.println(answer);

    }

    public String solution(String message, String word) {
        return message.replace(word, "");
    }
}
