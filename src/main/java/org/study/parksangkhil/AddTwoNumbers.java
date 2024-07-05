package org.study.parksangkhil;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class AddTwoNumbers {
    public List<Integer> solution(List<Integer> l1, List<Integer> l2) {
        List<Integer> answer = new ArrayList<>();

        // list들을 역순으로 변경
        Collections.reverse(l1);
        Collections.reverse(l2);

        // 역순 list를 담을 int 배열들 생성
        int[] x = new int[l1.size()];
        int[] y = new int[l2.size()];

        // 배열에 list값 담기
        for (int i = 0; i < l1.size(); i++) {
            x[i] = l1.get(i);
            y[i] = l2.get(i);
        }

        // 숫자 배열을 문자열로 변환하기 위해 선언
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // [3, 4, 2] -> 342
        for (int j = 0; j < x.length; j++) {
            sb1.append(x[j]);
            sb2.append(y[j]);
        }

        // 변환한 두값을 더함
        int result = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());

        // char 배열로 변환 후 역순으로 return 될 list에 더하기
        char[] chars = Integer.toString(result).toCharArray();
        for (int k = 0; k < chars.length; k++) {
            answer.add((int) chars[chars.length - 1 -k] - 48);
        }

        return answer;
    }
}
