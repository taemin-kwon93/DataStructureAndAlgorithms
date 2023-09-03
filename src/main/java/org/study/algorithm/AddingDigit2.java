package org.study.algorithm;

import java.util.Arrays;

public class AddingDigit2 {
    public static void main(String[] args) {
        AddingDigit2 addingDigit2 = new AddingDigit2();
        int answer = addingDigit2.solution(1234);
        System.out.println("answer: " + answer); // answer: 10
    }

    public int solution(int number) {
        int answer = 0;
        String numToString = number + "";
        // Integer.toString(number)를 사용해도 String으로 변환 가능합니다.
        // number 가 1234 인 경우 numToString 은 "1234" 의 값이 됩니다.

        String[] numToStringArray = numToString.split("");
        // "1234" 를 한자리씩 끊어 String 타입의 배열로 저장 합니다.
        // numToStringArray 의 값은 [1, 2, 3, 4] 입니다.
        for(int i = 0; i < numToString.length(); i++) {
            answer += Integer.parseInt(numToStringArray[i]);
        }


        return answer;
    }
}
