package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */

public class SplitBySpace {
    public String[] solution(String my_string) {
        String[] filteredStringArray = my_string.trim().split(" ");
        List<String> answer = new ArrayList<>();
        for (String i : filteredStringArray) {
            if (!i.isEmpty()) answer.add(i);
        }

        return answer.toArray(new String[0]);
    }

    public String[] solution2(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
