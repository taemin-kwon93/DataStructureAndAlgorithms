package org.study.algorithm;

public class AddingDigit {
    public static void main(String[] args) {
        AddingDigit addingDigit = new AddingDigit();
        int answer = addingDigit.solution(1234);
        System.out.println(answer);
    }

    public int solution(int number) {
        int answer = 0;
        String numToString = number + "";

        for(int i = 0; i < numToString.length(); i++) {
            answer += (Character.getNumericValue(numToString.charAt(i)));
        }

        return answer;
    }
}
