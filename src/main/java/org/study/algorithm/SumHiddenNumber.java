package org.study.algorithm;

/**
 * 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class SumHiddenNumber {

    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toLowerCase();
        for (int i = 0; i < 26; i++) {
            char c = 'a';
            my_string = my_string.replace((char)((int) c + i), '_');
        }
        String[] hiddenNumbers = my_string.split("_");

        for (String hiddenNumber : hiddenNumbers) {
            if (!hiddenNumber.isEmpty()) {
                answer += Integer.parseInt(hiddenNumber);
            }
        }
        return answer;
    }

    /**
     * 정규 표현식을 사용하여 문제를 해결
     */
    public int solution2(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");

        for (String s : str) if (!s.isEmpty()) answer += Integer.parseInt(s);

        return answer;
    }
}
