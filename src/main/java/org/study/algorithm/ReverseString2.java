package org.study.algorithm;

/**
 *문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class ReverseString2 {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        char[] answer = my_string.toCharArray();
        int pl = s;
        int pr = e;

        for (int i = 0; i <= (e - s) / 2; i++) {
            answer = swap(answer, pl++, pr--);
        }
        sb.append(answer);

        return sb.toString();
    }

    public char[] swap(char[] chArr, int a, int b) {
        char tmp = chArr[a];
        chArr[a] = chArr[b];
        chArr[b] = tmp;

        return chArr;
    }
}
