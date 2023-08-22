package org.study.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseNumberList2 {
    public int[] solution2(int[] numberList) {
        int length = numberList.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = numberList[(length - 1)- i];
        }
        return answer;
    }

    public int[] solution3(int[] numberList) {
        List<Integer> list = Arrays.stream(numberList).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
