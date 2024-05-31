package org.study.algorithm;

/**
 * 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class RemoveCharacters {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();

        char[] x = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            x[indices[i]] = '^';
        }
        for (int z = 0; z < x.length; z++) {
            if (x[z] != '^') {
                answer.append(x[z]);
            }
        }
        return answer.toString();
    }
}
