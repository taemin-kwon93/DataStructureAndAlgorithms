package org.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 */

public class StringSplitterAndSorter {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        Arrays.sort(parts);

        List<String> answer = new ArrayList<>();
        for (String i : parts) answer.add(i);

        Iterator<String> iterator = answer.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isEmpty()) iterator.remove();
        }

        return answer.toArray(new String[0]);
    }

    public String[] solution2(String myString) {
        // Split the string by "x" and filter out empty strings
        String[] answer = Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
        // Sort the resulting array
        Arrays.sort(answer);
        return answer;
    }
}
