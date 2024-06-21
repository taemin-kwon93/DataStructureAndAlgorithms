package org.study.parksangkhil;

import java.util.*;

public class MostCommonWord {
    // 나의 풀이
    public String solution(String s, String banned) {
        String[] strArr = s.toLowerCase().replace(".", "").replace(",", "").split( " ");
        Map<String, Integer> map = new HashMap<>();

        for (String part : strArr) {
            if (map.containsKey(part)) {
                map.put(part, map.get(part) + 1);
            } else {
                map.put(part, 1);
            }
        }

        String answer = "";
        int maxNum = 0;
        banned = banned.toLowerCase();
        for (String o : map.keySet()) {
            if (map.get(o) > maxNum && !o.equals(banned)) {
                maxNum = map.get(o);
                answer = o;
            }
        }

        return answer;
    }

    /**
     *  책을 보며 배운 내용:
     *  <p> 1. 데이터 클렌징(Data Cleansing) 작업을 통해 전처리(Preprocessing)를 합니다.
     * replaceAll("\\W+", " ") 을 사용해 단어 문자(Word Character)가 아닌것을 모두 공백으로 치환합니다.
     * '\W+' 는 연속적으로 단어 문자가 아닌값을 의미합니다. </p>
     * <p> 2. 각 단어가 몇 차례 등장하는지 개수를 헤아립니다.
     */
    public String solutionB(String s, String[] banned) {
        // 금지어 목록이 String 배열이므로, 비교 메소드를 제공하는 Set으로 변경
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        // 각 단어별 개수가 저장될 키-값 맵
        Map<String, Integer> counts = new HashMap<>();

        // 전처리 작업 후 단어 목록을 배열로 저장
        String[] words = s.replaceAll("\\W+", " ").toLowerCase().split(" ");
        for (String w : words) {
            if (!ban.contains(w)) {
                counts.put(w, counts.getOrDefault(w, 0) + 1);
            }
        }
        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
