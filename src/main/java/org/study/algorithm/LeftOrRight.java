package org.study.algorithm;

/**
 * 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
 * str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
 * 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * "l"이나 "r"이 없다면 빈 리스트를 return합니다.
 */
public class LeftOrRight {
    public String[] solution(String[] strs) {
        boolean isLeft = false;
        boolean isRight = false;
        int idx = 0;

        for (String s : strs) {
            idx++;
            if (s.equals("l")) {
                isLeft = true;
                break;
            } else if (s.equals("r")) {
                isRight = true;
                break;
            }
        }

        if (isLeft) {
            String[] answer = new String[idx - 1];
            System.arraycopy(strs, 0, answer, 0, idx - 1);
            return answer;
        } else if (isRight) {
            String[] answer = new String[strs.length - idx];
            for (int j = 0; j < answer.length; j++) {
                answer[j] = strs[idx++];
            }
            return answer;
        }
        return new String[] {};
    }
}
