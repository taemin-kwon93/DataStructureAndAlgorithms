package org.study.algorithm;

import java.util.*;

public class TrinaryDigit {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();

        // 십진수를 삼진수로 변환하는 계산 방법.
        // 아래의 과정을 통해 45는 0 -> 0 -> 2 -> 1 과 같이 list에 값을 추가함.
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        return convertToDecimal(list);
    }

    /**
     * @return 삼진수로 변환한 숫자를 다시 십진수로 변환하여 return함
     */
    private int convertToDecimal(List<Integer> list) {
        int answer = 0;
        int counter = list.size() - 1;
        int idx = 0;
        int a;

        while (counter != 0) {
            a = 1;

            for (int i = 0; i < counter; i++) {
                a *= 3;
            }
            answer += a * list.get(idx++);
            counter--;
        }

        return answer + list.get(idx);
    }

    /**
     * Integer.parseInt를 사용해 삼진수 숫자를 십진수로 변환함.
     */
    public int solutionB(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
