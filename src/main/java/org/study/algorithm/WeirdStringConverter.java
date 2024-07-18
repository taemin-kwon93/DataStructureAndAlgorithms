package org.study.algorithm;

/**
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */
public class WeirdStringConverter {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int wordIdx = 0;

        for (int i = 0; i < s.length(); i++) {
            // 단어에서 홀수번째 글자, 대문자 처리를 해야함
            if (wordIdx % 2 == 0 && s.charAt(i) < 123 && s.charAt(i) > 96) {
                chars[i] = (char) (chars[i] - 32);
            // 단어에서 짝수번째 글자, 대문자 처리를 해야함
            } else if (wordIdx % 2 != 0 && s.charAt(i) > 64 && s.charAt(i) < 91) {
                chars[i] = (char) (chars[i] + 32);
            }
            // s의 글자중 공백을 만나게 되면 currentIdx는 0으로 초기화
            wordIdx = chars[i] == 32 ? 0 : wordIdx + 1;
        }
        return new String(chars);
    }
}
