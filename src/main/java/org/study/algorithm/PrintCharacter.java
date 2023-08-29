package org.study.algorithm;

public class PrintCharacter {
    public static void main(String[] args) {
        PrintCharacter printCharacter = new PrintCharacter();
        String result = printCharacter.solution("abc", 3);
        String result2 = printCharacter.solution2("abc", 3);
        System.out.println(result);
        System.out.println(result2);
    }
    public String solution(String myString, int n) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            for(int j = 0; j < n; j++) {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }

    public String solution2(String myString, int n) {
        StringBuilder sb = new StringBuilder();
        for(char character : myString.toCharArray()) {
            sb.append((character + "").repeat(n));
        }
        return sb.toString();
    }
}
