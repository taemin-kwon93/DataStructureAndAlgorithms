package org.study.algorithm;

/**
 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 */

public class FindAfterStringSwap {
    public int solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                answer.append('B');
            } else if (myString.charAt(i) == 'B') {
                answer.append('A');
            } else {
                System.out.println("Not A and B, Character: " + myString.charAt(i) + " index: " + i);
            }
        }

        return answer.toString().contains(pat) ? 1 : 0;
    }
}
