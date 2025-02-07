package org.study.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuple {
    public int[] solution(String s) {
        // 중괄호 제거 후 쉼표 기준으로 숫자 추출
        s = s.replaceAll("[{}]", "");
        String[] nums = s.split(",");

        // 숫자의 등장 횟수를 저장할 Map
        Map<String, Integer> map = new HashMap<>();
        for (String n : nums) {
            if (!n.isEmpty())
                map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 등장 횟수 기준으로 내림차순 정렬
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        // 결과 배열 생성
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = Integer.parseInt(list.get(i).getKey());

        return result;
    }
}
